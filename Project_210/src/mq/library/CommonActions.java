package library;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CommonActions 
{
	WebDriver driver;
	String screenpath="D:\\24_Mar_2023_11Am\\Project_210\\Screens\\";
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String mainwindowid;
	public CommonActions()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		mainwindowid=driver.getWindowHandle();
	}
	
	public void LoadPage(String url)
	{
		driver.get(url);
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void sleep(long ms)
	{
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			
		}
	}
	
	//Type text into Entryboxes
	public void typetext(String xpath,String input)
	{
		try {
			driver.findElement(By.xpath(xpath)).sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Type Text using keyboard actions
	public void keyboard_Sendtext(String xpath,String input)
	{
		new Actions(driver).sendKeys
		(driver.findElement(By.xpath(xpath)), input);
	}
	
	//Type text using javascript
	public void TypeText_JS(String xpath,String input)
	{
		WebElement Element=driver.findElement(By.xpath(xpath));
		((JavascriptExecutor)driver)
		.executeScript("document.querySelector("+xpath+")", Element);
	}
	
	
	/*
	 * Left Mouseclick actions[Suites for Buttons,Links,RadioButton,
	 * Checkbox,Tabs,ListofItems]
	 */
	public void ClickElemnet(String xpath)
	{
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Select Dropdown option using OptinName [Suites for Select Tag Elements]
	public void selectdropdownoption(String xpath,String optionname)
	{
		try {
			new Select(driver.findElement(By.xpath(xpath)))
			.selectByVisibleText(optionname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//CaptureScreen
	public void CaptureScreen(String Imagename)
	{
			String time=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss").format(new Date());
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(screenpath+Imagename+time+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//CaptureScreen at location
	public void CaptureScreen(String ElementXpath,String Imagename)
	{
			String time=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss").format(new Date());
		try {
			File src=driver.findElement(By.xpath(ElementXpath)).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(screenpath+Imagename+time+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Switch to second window
	public void SwitchToNextWindow()
	{
		 //Get All Window IDs
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
		}
		
	}
	
	
	//Switch back to mainwindow
	public void GetbacktoMainwindow()
	{
		driver.switchTo().window(mainwindowid);
	}
	
	//Switch to window with title
	public void switchtowindowWithTitle()
	{
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
	
	//Create New Tab 
	public WebDriver CreateNewTAB()
	{
		return driver.switchTo().newWindow(WindowType.TAB);
	}
	
	//Create New Tab 
	public WebDriver CreateNewWIndow()
	{
		return driver.switchTo().newWindow(WindowType.WINDOW);
	}
	
	
	//Switch to frame
	public void SwitchToNewFrame(String FrameNameOrID)
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(FrameNameOrID);
	}
	
	//Switch to Frame Using Frame Reference
	public void SwitchtoFrame_UsingFrameLocation(String FrameXpath)
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(FrameXpath)));
	}
	
	
	
	
}
