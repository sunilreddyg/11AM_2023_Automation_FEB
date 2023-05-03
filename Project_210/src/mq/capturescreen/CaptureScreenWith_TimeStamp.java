package capturescreen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenWith_TimeStamp {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();    
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    
	    
	    //Get Current System date  [java time stampt]
	    Date d=new Date();
	    //Create simple date format
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		//Convert Current system using date formatter
	    String time=sdf.format(d);
	    
	    
		/*
		 * Only selenium 4 have this feature..
		 */
	    WebElement LoginForm=driver.findElement(By.xpath("//div[@class='_ab21'][contains(.,'Phone number, username, or emailPasswordLog inorLog in with FacebookForgot password?')]"));
		File src=LoginForm.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("Screens\\image"+time+".png"));
		
		
		/*
		 * Time Regular expressions in java
		 * 
		 * 	yy  ----> year   23
		 * yyyy ----> year   2023
		 * MM   ----> month	 01-12
		 * MMM  ----> month  JAN-DEC
		 * dd   ----> date	 01-31
		 * hh   ----> hour	 01-24
		 * mm   ----> minute 01 -60
		 * ss   ----> seconds 01-60
		 */

	}

}
