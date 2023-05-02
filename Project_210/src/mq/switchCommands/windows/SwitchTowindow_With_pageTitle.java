package switchCommands.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTowindow_With_pageTitle {

	public static void main(String[] args) {
		
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
			String PageTitle=driver.switchTo().window(EachWindowID).getTitle();
			if(PageTitle.contains("Instagram"))
			{
				break;   //Break stop iteration and eject from looping
			}
		}

		
	}

}
