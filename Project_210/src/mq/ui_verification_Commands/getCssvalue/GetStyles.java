package ui_verification_Commands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetStyles 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Object=driver.findElement(By.xpath("//p[contains(.,'Forgot your password?')]"));
		//Read Text Color Displayed
		String ActColor=Object.getCssValue("color");
		System.out.println("Color Displayed is RGBA --> "+ActColor);
		
		//Selenium 4  Manage Color Codes
		String Exp_RGB="rgb(255, 123, 29)";
		
		Color obj=Color.fromString(ActColor);
		String ActColorIn_RGB=obj.asRgb();
		
		if(Exp_RGB.equals(ActColorIn_RGB))
			System.out.println("Match found");
		else
			System.out.println("Invalid Text Color displayed");
		
		
		/*
		 * https://www.selenium.dev/documentation/webdriver/support_features/colors/
		 */
	}

}
