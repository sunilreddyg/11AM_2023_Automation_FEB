package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToView_Object {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(5000);
		
		//Enable Javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);

		
		WebElement View=driver.findElement(By.xpath("(//a[@class='view-all-comp'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", View);
		
		
		//Only Selenium 4 version have this feature
		//new Actions(driver).scrollToElement(View).perform();
	}

}
