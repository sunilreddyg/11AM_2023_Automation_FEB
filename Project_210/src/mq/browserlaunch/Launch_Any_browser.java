package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Any_browser 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * => WebDriver is a interface class it can manipulate
		 * 		all browser instances supported by selenium.
		 * 
		 * => WebDriver contains browser autmation commands
		 * 	  it can implement all browser instances
		 * 
		 * => WebDriver support cross browser automation
		 * 
		 */
		
		
		//Launching Chrome browser and storing reference into WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		//Load Webpage
		driver.get("http://facebook.com");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Printing title
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		//Sleep SomeTime
		Thread.sleep(4000);
		
		//Close browser
		driver.close();
	}

}
