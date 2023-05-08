package exceptions_java;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try_Catch_Exception1 
{

	public static void main(String[] args) 
	{
	
		
		
		try {
			//try your source
		} catch (Exception e) {
			//Handle Exception here
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		WebDriver driver;
		try {
			driver=new ChromeDriver();
			System.out.println("Browser is Opened");
			
			driver.get("http://facebook.com");
			System.out.println("Page is opened");
			
			driver.findElement(By.id("email1")).sendKeys("Darshan");
			System.out.println("Object identified at webpage");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Set Explicit wait");
		}
		
		
		
		
		
		
		

	}

}
