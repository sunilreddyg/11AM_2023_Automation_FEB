package findElements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Restricted_Month_And_Dates_Inside_DatePicker 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		//Open Calendar
		WebElement Calendar=driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']"));
		Calendar.click();
		Thread.sleep(3000);
		
		By NextButton=By.cssSelector(".ta-right path:nth-child(3)");
		while(true)
		{
			
			String RuntimeClass=driver.findElement(By.xpath("//*[@data-testid='rightArrow']")).getAttribute("class");
			if(RuntimeClass.contains("c-neutral-200"))
			{
				break;
			}
			driver.findElement(NextButton).click();
			Thread.sleep(1000);
		}
	}

}
