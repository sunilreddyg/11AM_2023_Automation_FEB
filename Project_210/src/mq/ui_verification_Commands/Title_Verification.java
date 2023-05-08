package ui_verification_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Verification 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
			if(driver.getTitle().equals("Facebook – log in or sign up"))
			{
				System.out.println("Enter Login Details");
			}
			else
			{
				System.out.println("Wrong Page loaded");
				throw new Exception("Wrong page is loaded");
			}
			
		}
		

	}

}
