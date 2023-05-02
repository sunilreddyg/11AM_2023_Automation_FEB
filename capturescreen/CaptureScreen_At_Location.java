package capturescreen;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_At_Location 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();    
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
		
		/*
		 * Only selenium 4 have this feature..
		 */
	    WebElement LoginForm=driver.findElement(By.xpath("//div[@class='_ab21'][contains(.,'Phone number, username, or emailPasswordLog inorLog in with FacebookForgot password?')]"));
		File src=LoginForm.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("Screens\\image2.png"));
		
		
	}

}
