package ui_verification_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verifications {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(driver!=null)
		{
			driver.get("http://outlook.com");
			driver.manage().window().maximize();
			
			//Get page verifications
			String PageTitle=driver.getTitle();
			System.out.println("Page Title is --> "+PageTitle);
			
			//Get Page Url
			String PageUrl=driver.getCurrentUrl();
			System.out.println("Page  url is ---> "+PageUrl);
			
			//GetPageSource
			String PageSource=driver.getPageSource();
			System.out.println("Page Source is ---> "+PageSource);
			
			//Get Window Handle
			String WindowID=driver.getWindowHandle();
			System.out.println("Window Id is ---> "+WindowID);
			
			driver.close();
			
		}
		else
		{
			System.out.println("Driver Launched failed");
		}
		
		
		

	}

}
