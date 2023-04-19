package mq.selenium.interactions.Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_With_Keyboard 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		
		
		WebElement From=driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10'][contains(.,'From')]"));
		new Actions(driver)
		.click(From).pause(2000)
		.sendKeys("DEL").pause(2000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ENTER).perform();
		
		
		

	}

}
