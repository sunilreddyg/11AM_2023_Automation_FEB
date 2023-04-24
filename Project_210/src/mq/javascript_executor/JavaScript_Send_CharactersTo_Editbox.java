package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class JavaScript_Send_CharactersTo_Editbox {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Using Selenium Method Type text into editbox
		//driver.findElement(By.id("email")).sendKeys("Darshan");
		
		
		//Using Keyboard interaction typing text into Editbox
		new Actions(driver).sendKeys
		(driver.findElement(By.id("email")), "Hello").perform();
		
		//Using javascript typing text into editbox
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').value='Darshan'");
		
		//Using javascript typing text into editbox
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('pass').value='Admin@123'");
		
		//Javascript using xpath identification
		WebElement LoginButton=driver.findElement(By.xpath("//button[contains(@data-testid,'button')]"));
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].click()", LoginButton);
		
		
		

	}

}
