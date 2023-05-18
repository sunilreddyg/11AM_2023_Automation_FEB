package pageobjects.withPageFactory.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRM_Login 
{
	WebDriver driver;
	public HRM_Login(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		//this keyword represent current class
		this.driver=driver;
	}
	
	
	//@Findby annotation look for object at webpage
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	public WebElement loginbutton;
	
		
	public void waitforusername()
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOf(username));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
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
