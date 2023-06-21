package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_Test {

	public static void main(String[] args) throws Exception 
	{
		
		//Browser setup
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);   //Wait for 5 seconds static time
		
		//Login Test
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		
		Thread.sleep(5000);   //Wait for 5 seconds static time
		
		//Click to open Logout list
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
		
		
		//Close browser
		driver.close();
	}

}
