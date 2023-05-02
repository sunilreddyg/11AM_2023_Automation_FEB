package switchCommands.windows;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    //Get Current Focused window id
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	    
	    //External Link --. Open Page at new window /TAB
	    WebElement Instagram=driver.findElement(By.linkText("Instagram"));
	    Instagram.click();
	    
	    //Get All Window IDs
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
		}
		
		/*
		 * Note:--> Here is the assumption when loop finished
		 * 			by default controls will be presented at second window
		 */
		System.out.println(driver.getTitle());
		
		//GetControl Back to mainwindow
		driver.switchTo().window(MainWindowID);
		System.out.println("Mainwindow title is ---> "+driver.getTitle());
		
	}

}
