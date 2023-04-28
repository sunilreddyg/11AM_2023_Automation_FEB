package switchCommands.windows;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_SecondWindow {

	public static void main(String[] args) throws Exception {
		
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
	   
	   //Converting Set of String values into iterators
	   Iterator<String> itr=AllWindowIDS.iterator();
	    
	   //Read each iterator with next keyword
	   String window1=itr.next();
	   String window2=itr.next();
	   
	   //Switch to Second Window
	   driver.switchTo().window(window2);
	   
	   System.out.println("Second window title is --->"+driver.getTitle());
	   
	   //Enter login at instagram page
	   Thread.sleep(3000);
	   WebElement MobileNumber=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
	   MobileNumber.sendKeys("9030248855");
	   
	   //Close Second window
	   driver.close();
	   
	   
	   //Switch Back to Mainwindow
	   driver.switchTo().window(window1);
	   System.out.println("Facebook Window title is ---> "+driver.getTitle());
	   
	   
	   
	}

}
