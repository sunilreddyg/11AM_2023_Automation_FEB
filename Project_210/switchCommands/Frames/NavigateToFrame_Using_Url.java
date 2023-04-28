package switchCommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToFrame_Using_Url {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/info/redcare");
	    driver.manage().window().maximize();
	    
	    
	    driver.navigate().to("https://www.redbus.in/ryde/req.html?hideBackArrow=true&isDesktop=true");
		
	    Thread.sleep(4000);
	    //Click Location
	    driver.findElement(By.xpath("(//div[contains(@class,'sbgID')])[1]")).click();
	    
	    //navigate back to main page
	    driver.navigate().back();
	}

}
