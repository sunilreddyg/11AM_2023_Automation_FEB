package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example 
{
	
	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		//Clicking on button using Mouse left action
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Type email editbox and press enter at Keyboard
		driver.findElement(By.xpath("//input[contains(@id,'i0116')]"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(5000);
		
		//Type password editbox and press enter at keyboard
		driver.findElement(By.xpath("//input[@id='i0118']"))
		.sendKeys("Hello@123"+Keys.ENTER);
		
	}

}
