package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example2 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@name='firstname']"))
		.sendKeys("Arjun"+Keys.TAB+"Krishna"+Keys.TAB+"arjunkrishna@gmail.com");
		
		
		//Selecting dropdown option using characters sequences
		driver.findElement(By.xpath("//select[@id='day']"))
		.sendKeys("26");
		
		driver.findElement(By.xpath("//select[@id='month']"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		/*
		 * Note:--> Don't use sendkeys method to select dropdown
		 * 			options. Because selenium contains separate 
		 * 			methods to select dropdown options...
		 */

	}

}
