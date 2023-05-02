package switchCommands.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebPage_At_New_TAB {

	public static void main(String[] args) 
	{
	
		
		WebDriver driver=new ChromeDriver();    
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    //Get Current Focused window id
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	    System.out.println("Mainwindow Title is--> "+driver.getTitle());
	    
	 
	    WebDriver Meta=driver.switchTo().newWindow(WindowType.TAB);
	    Meta.get("https://about.meta.com/");
	    
	    String MetaID=Meta.getWindowHandle();
	    System.out.println(MetaID);  
	    System.out.println("Meta window title is--> "+Meta.getTitle());
	    
	    driver.switchTo().window(MainWindowID);
	    WebDriver Blog=driver.switchTo().newWindow(WindowType.WINDOW);
	    Blog.get("https://about.instagram.com/blog/");
	    String BlogID=Blog.getWindowHandle();
	    System.out.println(BlogID);
	    System.out.println("Blog Title is---> "+Blog.getTitle());
	    
	    
	    /*
	     * Note:-->
	     * 		Only in selenium 4 we can create new window or TAB
	     */
	    
	}

}
