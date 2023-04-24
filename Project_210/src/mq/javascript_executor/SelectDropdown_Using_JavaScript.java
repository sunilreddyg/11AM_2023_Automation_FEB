package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdown_Using_JavaScript {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		//Enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
				
		//Selecting Option from dropdown using Value property
		WebElement DayDropdown=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		js.executeScript("arguments[0].value='24'", DayDropdown);
		
		
		//Selecting Option from dropdown using Index Property
		Thread.sleep(3000);
		WebElement MonthDropdown=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		js.executeScript("arguments[0].value='Dec'", MonthDropdown);
		
		
		//Selecting Option from dropdown using Value property
		WebElement YearDropdown=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		js.executeScript("arguments[0].selectedIndex='20'", YearDropdown);
		
				
	}

}
