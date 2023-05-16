package waitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_Attribute 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		Thread.sleep(5000);
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Roundtrip.click();
		Thread.sleep(3000);
		
		By DoubleSeatFares=By.xpath("//p[contains(.,'Double Seat  Fares')]");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(130));
		wait.until(ExpectedConditions.attributeToBe(DoubleSeatFares, "class", "disabled"));
		System.out.println("Object is disabled on Roundtrip");
		
		
		
	}

}
