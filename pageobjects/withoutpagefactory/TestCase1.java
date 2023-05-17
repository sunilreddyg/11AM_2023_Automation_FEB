package pageobjects.withoutpagefactory;

import org.openqa.selenium.WebDriver;

public class TestCase1 
{
	WebDriver driver;
	TestBase base;
	public TestCase1() 
	{
		base=new TestBase();
		base.SetupChrome();
		base.Account_login();
		driver=base.driver;
	}
	
	public void Tc001_Add_AdminSystemUser()
	{
		driver.findElement(CommonObjects.MenuTab_Admin).click();
		base.static_time(3000);
		
		driver.findElement(CommonObjects.System_user_Adduser).click();
		base.static_time(3000);
	}
	
	
	
}
