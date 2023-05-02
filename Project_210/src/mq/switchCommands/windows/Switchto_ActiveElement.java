package switchCommands.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_ActiveElement 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();    
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    //You can switch to any active element 
	    driver.switchTo().activeElement().sendKeys("Info");
	    
	}

}
