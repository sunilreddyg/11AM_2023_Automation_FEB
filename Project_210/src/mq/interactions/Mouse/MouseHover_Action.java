package mq.selenium.interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Action {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		//Perforing hover action on selected location
		WebElement Account=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		new Actions(driver).moveToElement(Account).perform();
		
		//Performing mouse click action on selected location
		WebElement Createlist=driver.findElement(By.xpath("//span[contains(.,'Create a List')]"));
		new Actions(driver).click(Createlist).perform();
		
		
		
	}

}
