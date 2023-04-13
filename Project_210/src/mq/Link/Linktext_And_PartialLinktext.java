package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_And_PartialLinktext {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Locations")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("India")).click();

	}

}
