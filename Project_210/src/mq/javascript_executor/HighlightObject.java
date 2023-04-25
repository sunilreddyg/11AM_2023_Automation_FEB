package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightObject 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		//Enable Javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);


		WebElement Element=driver.findElement(By.linkText("Forgotten password?"));
		js.executeScript("arguments[0].style.backgroundColor='yellow'", Element);
		
		
		//Set outline to Object
		js.executeScript("arguments[0].style.outline ='5px dotted green'", Element);

		
	}

}
