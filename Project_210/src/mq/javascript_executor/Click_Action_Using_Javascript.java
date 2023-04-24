package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Action_Using_Javascript {

	public static void main(String[] args) throws Exception {
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		//Enable javascript on automation browser
		WebElement SignInbutton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click()", SignInbutton);
		
		//Type email
		js.executeScript("document.querySelector(\"#i0116\")"
				+ ".value='sunilreddy.gajjala@outlook.com'");
		
		Thread.sleep(3000);
		//Click button using javascript
		js.executeScript("document.querySelector(\"#idSIButton9\").click()");
	}

}
