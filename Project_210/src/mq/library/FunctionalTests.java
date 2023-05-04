package library;

import org.openqa.selenium.WebDriver;

public class FunctionalTests 
{
	
	public static void main(String[] args) 
	{
	
			CommonActions action=new CommonActions();
			action.sleep(3000);
			
			WebDriver driver;
			driver=action.getDriver();
			System.out.println(driver.getTitle());
			
			//user login
			action.typetext("//input[@name='username']", "Admin");
			action.typetext("//input[@type='password']", "admin123");
			action.ClickElemnet("//button[@type='submit']");
			action.sleep(5000);
			
		
			
			
			
	}

}
