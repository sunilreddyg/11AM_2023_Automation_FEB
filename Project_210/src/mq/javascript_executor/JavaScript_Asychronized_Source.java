package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Asychronized_Source
{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	   // Performing a sleep in the browser under test. 
	
	   long start = System.currentTimeMillis();
	
	   ((JavascriptExecutor) driver)
	   .executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
	 
	   System.out.println("Elapsed time:--> "+(System.currentTimeMillis()-start));
	  
	  System.out.println("All Source loaded at webpage");
	  
	  
		  /*
		   * Executescript:-->
		   * 		To change html content / make runtime changes
		   * 		at automation browser
		   * 		 ((JavascriptExecutor) driver).executeScript
		   * 		("return alert('Am an alert')");
		   * ExecuteAsynScript
		   * 
		   * 		To manage explicit or browser time gaps
		   * 		at automation browser
		   * 		
		   * 		((JavascriptExecutor) driver).executeAsyccript
		   *        ("window.setTimeout(arguments[arguments.length - 1], 500);");
		   */
	  
	  		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
	  
		  
	}

}
