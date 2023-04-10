package using_webdriverManager;


import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome 
{

	public static void main(String[] args) 
	{
	
		//Launching Chrome browser using WebdriverManager
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		
		
		//Launching firefox browser using Webdrivermanger
		WebDriver wd=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		wd.get("http://outlook.com");

	}

}
