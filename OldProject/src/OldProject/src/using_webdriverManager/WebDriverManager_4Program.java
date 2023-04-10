package using_webdriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_4Program {

	public static void main(String[] args) {
		
		//This line Setup ChromeDriver at Runtime
		WebDriverManager.chromedriver().setup();
		
		//LaunchBrowser and Storinginto Webdriver Interface
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");

	}

}
