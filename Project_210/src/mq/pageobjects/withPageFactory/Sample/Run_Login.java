package pageobjects.withPageFactory.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Login {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Using Pagafactory class inorder to identify @Findby variables
		HRM_Login login=PageFactory.initElements(driver, HRM_Login.class);
		
		
			//First Option
			login.username.sendKeys("Admin");
			login.password.sendKeys("admin@123");
			login.loginbutton.click();
			
			//Second Option
			login.Enterusername("Admin");
			login.enterpassword("admin@123");
			login.clickloginbutton();
			
			//Third Option
			login.Userlogin("Admin", "admin@123");
		
	}

}
