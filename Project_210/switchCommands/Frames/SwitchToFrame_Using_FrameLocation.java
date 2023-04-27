package switchCommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_FrameLocation {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/info/redcare");
	    driver.manage().window().maximize();
	    
	    //Identifying Iframe location and Applying switch to it
	    WebElement FrameLocation=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	    driver.switchTo().frame(FrameLocation);
	    
	    
	    
	    WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
	    MobileNumber.sendKeys("9030248855");
	    

	}

}
