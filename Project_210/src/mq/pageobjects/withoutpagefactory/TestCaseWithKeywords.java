package pageobjects.withoutpagefactory;

import org.openqa.selenium.WebDriver;

public class TestCaseWithKeywords 
{
	WebDriver driver;
	TestBase base;
	PageObject_keywords keywords;
	public TestCaseWithKeywords()
	{
		base=new TestBase();
		base.SetupChrome();
		base.Account_login();
		driver=base.driver;
		keywords=new PageObject_keywords(driver);
	}
	
	public void TestCaseAddingSystmeUser()
	{
		keywords.ClickElemnet(CommonObjects.MenuTab_Admin);
		keywords.ClickElemnet(CommonObjects.System_user_Adduser);
	}
	

}
