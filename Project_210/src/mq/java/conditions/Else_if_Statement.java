package mq.java.conditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Else_if_Statement {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Elseif:-->
		 * 		Multiple decision take place here..
		 */
		
		
		 int a=18;
		 
		if (a > 18) 
		{
			System.out.println("Valid");
		}
		else if ( a < 18) 
		{
			System.out.println("invalid");
		}
		else if (a==18) 
		{
			System.out.println("Valid With Condition");
		}
		 
		
		WebDriver driver = null;
		String browser="chrome";
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("browsername mismatched");
		}
		
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
			System.out.println(driver.getTitle());
		}
		else
			System.err.println("Driver Initiation failed");
	
		
	}

}
