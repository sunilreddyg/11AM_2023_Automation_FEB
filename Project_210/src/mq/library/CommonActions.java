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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions 
{
	WebDriver driver;
	String screenpath="D:\\24_Mar_2023_11Am\\Project_210\\Screens\\";
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String mainwindowid;
	WebDriverWait wait;
	public CommonActions()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		mainwindowid=driver.getWindowHandle();
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	
	//Launch any browser [chrome,firefox,ie]
	//Parameter ---> Local
	public void LaunchBrowser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("browsername mismatched");
		}
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
	
	
	
	//Wait for VisibilityofObject
	public WebElement Waitfor(String type,String xpath)
	{
		WebElement Element=null;
		switch (type) {
		case "visibile":
			Element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			break;
			
		case "clickable":
			Element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			break;

		case "presence":
			Element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			break;
		default: System.out.println("Mismatch");
			break;
		}
		
		return Element;
	}
	
	//Type text into Entryboxes
	public void typetext(String xpath,String input)
	{
		try {
			Waitfor("visible", xpath).sendKeys(input);
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
	
	
	//Verify Title presented
	public boolean  VerifyPageTitle(String ExpTitle)
	{
		return driver.getTitle().equals(ExpTitle);
	}
	
	//Verify Url Presented
	public boolean verifyPageurl(String Expurl)
	{
		return driver.getCurrentUrl().contains(Expurl);
	}
	
	//Verify ElementPresentedAtSource
	public boolean VerifyElementAtSource(String ElementID)
	{
		return driver.getPageSource().contains(ElementID);
	}
	
	
	//Verify ElementPresentedAtSource
	public WebElement CheckElementPresentedAtSource(String xpath)
	{
		try {
			return driver.findElement(By.xpath(xpath));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//Check Text Presented at webpage
	public boolean VerifyTextAtWebpage(String ExpText)
	{
		String PageText=driver.findElement(By.tagName("body")).getText();
		return PageText.contains(ExpText);
	}
	
	//Check Text Presented at location
	public boolean VerifyTextAtLocation(String Xpath,String ExpText)
	{
		boolean flag=false;
		if(CheckElementPresentedAtSource(Xpath)!=null)
		{
			String PageText=driver.findElement(By.xpath(Xpath)).getText();
			 flag=PageText.contains(ExpText);
		}
		return flag;
	}
	
	//Read Text Presented at location
	public String ReadtextAtLocation(String Xpath)
	{
		String Pagetext=null;
		if(CheckElementPresentedAtSource(Xpath)!=null)
		{
			Pagetext=driver.findElement(By.xpath(Xpath)).getText();
		}
		return Pagetext;
	}
	
	
	
}
