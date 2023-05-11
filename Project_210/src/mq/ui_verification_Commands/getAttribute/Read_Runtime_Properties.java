package ui_verification_Commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Runtime_Properties 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verifying Double Seat fares Disabled
		 * 				on roundtrip selection
		 * 
		 * 		Give site url is  http://makemytrip.com
		 * 		When User Select Roundtrip Radio button
		 * 		And verify roundtrip is selected
		 * 		Then Verify Double fares checkbox is disabled
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		Thread.sleep(5000);
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Roundtrip.click();
		Thread.sleep(3000);
		
		
		String RoundtripClass=Roundtrip.getAttribute("class");		
		if(RoundtripClass.contains("selected"))
		{
			System.out.println("Round Trip is Selected");
			
			WebElement DoubleSeatFares=driver.findElement(By.xpath("//ul[@class='specialFareNew']/li[6]"));
			String RuntimeClass=DoubleSeatFares.getAttribute("class");
			if(RuntimeClass.contains("isItemDisabled"))
			{
				System.out.println("Dobleseatfares disabled on Roundtrip Selection");
			}
			else
			{
				System.out.println("Doubleseatfaries Enabled on Roundtrip selection");
			}
		}
		else
		{
			System.out.println("Roundtrip is not selected");
		}
	}

}
