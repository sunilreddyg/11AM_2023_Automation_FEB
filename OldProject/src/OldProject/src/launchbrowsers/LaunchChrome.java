package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down a page until receive Browsers
		 * 		=> Click  to open list of browser drivers
		 * 		=> under Chrome browser click on documentation link
		 * 		=> Check what version of chrome browser is installed
		 * 	
		 * 					Open ChromeBrowser --> click on settings
		 * 					---> Help Menu----> About google chrome
		 * 		=> Click on chromedriver version w.r.t chrome browser version
		 * 		=> Select required operating system and click  on download
		 * 		=> After download unzip file to backup location
		 * 		=> After unzip you receive chromedriver.exe file then set up
		 * 			environment variable for chromedriver.exe file..
		 * 
		 */
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://facebook.com");
	}

}
