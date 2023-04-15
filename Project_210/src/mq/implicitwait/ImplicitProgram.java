package mq.selenium.implicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitProgram 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		System.out.println("Program start");
		driver.findElement(By.id("email")).sendKeys("Admin");

	}

}
