package ui_verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Verification 
{

	public static void main(String[] args) throws Exception {


		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(driver!=null)
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			WebElement ForgotPassword=driver.findElement(By.xpath("//p[contains(.,'Forgot your password?')]"));
			ForgotPassword.click();
			
			//Get Runtime page url and Title
			String ActTitle=driver.getTitle();
			String ActUrl=driver.getCurrentUrl();
			
			String ExpTitle="OrangeHRM";
			String ExpUrl="requestPasswordResetCode";
			
			if(ActTitle.contains(ExpTitle) && ActUrl.contains(ExpUrl))
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
