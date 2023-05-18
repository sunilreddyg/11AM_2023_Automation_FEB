package pageobjects.withPageFactory.Runs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.withPageFactory.Pages.HRM_Login;

public class Run_HRM_Login {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		HRM_Login login=new HRM_Login(driver);
		login.waitforusername();
		login.Userlogin("Admin","admin123");

	}

}
