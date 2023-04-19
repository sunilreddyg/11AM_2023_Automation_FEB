package mq.selenium.interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy_using_Coordinates {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		
		WebElement Handler1=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[1]"));
		
		//Get location Point
		int Objx=Handler1.getLocation().getX();
		
		new Actions(driver).dragAndDropBy(Handler1, 100, 0).perform();

		//Get location Point
		System.out.println(Handler1.getLocation().getX()-Objx);
			
		
		WebElement Handler2=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[2]"));
		new Actions(driver).dragAndDropBy(Handler2, -100, 0).perform();
		
		
	}

}
