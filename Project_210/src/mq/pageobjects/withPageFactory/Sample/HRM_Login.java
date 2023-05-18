package pageobjects.withPageFactory.Sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HRM_Login 
{
	//@Findby annotation look for object at webpage
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	public WebElement loginbutton;
	
	
	public void statictime(long ms)
	{
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void Enterusername(String UID)
	{
		statictime(3000);
		username.sendKeys(UID);
	}
	
	public void enterpassword(String pwd)
	{
		statictime(1000);
		password.sendKeys(pwd);
	}
	
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	
	public void Userlogin(String UID,String pwd)
	{
		Enterusername(UID);
		enterpassword(pwd);
		clickloginbutton();
	}
	

}
