package framework.junit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Junit_WebDriverTest 
{
	static WebDriver driver=null;
	static WebDriverWait wait;
	
	//Catpure Current running test details
	public @Rule TestName obj=new TestName();
	
	@BeforeClass
	public static void SetUpBeforeclass() throws Exception
	{
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	@Before
	public void beforemetod()
	{
		driver.get("http://facebook.com");
	}
	
	@Test
	public void Tc001_VerifySignupPage()
	{
		driver.findElement(By.linkText("Sign Up")).click();
		Assert.assertEquals
		("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Signup page title verified");
	}
	
	@Test
	public void Tc002_VerifyLoginPage()
	{
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals
		("Log in to Facebook", driver.getTitle());
		System.out.println("Login page title verified");
	}
	
	@Test
	public void Tc002_VerifyMessengerPage()
	{
		driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals
		("Messenger", driver.getTitle());
		System.out.println("Messenger title verified");
	}
	
	
	@After
	public void teardown() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\"+obj.getMethodName()+".png"));
	}
	
	
	
	@AfterClass
	public static void teardownAfterClass() throws Exception
	{
		Thread.sleep(5000);
	}
	
	
}
