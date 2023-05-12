package ui_verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource 
{

	public static void main(String[] args) {
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
			String PageSource=driver.getPageSource();
			if(PageSource.contains("email"))
			{
					driver.findElement(By.id("email")).sendKeys("Darshan");
			}
			else
			{
				System.out.println("Element not found at source");
			}
			
			
			try {
				driver.findElement(By.id("pass")).sendKeys("hello");
				System.out.println("password Entered successfully");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		

	}

}
