package mq.selenium.AutoCompleteEditbox;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox_With_IMplicit_Wait {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000); //Static time to close advertise popus manually
		
		/*
		 * Implicitwait:-->
		 * 		=> Set timeout until object loaded into document object model [DOM]
		 * 		=> This timeout enabled on NosuchElement Exception..
		 * 		
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Clicking on From City Label
		driver.findElement(By.xpath("//span[contains(.,'From')]")).click();
		
		//Typing referral text into entry box
		driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys("BLR");
		driver.findElement(By.xpath("(//p[@class='font12 greyText appendBottom3'][contains(.,'Bengaluru International Airport')])[1]")).click();
		
		
		//Clicking on To City Lable
		driver.findElement(By.xpath("(//span[contains(.,'To')])[1]")).click();
		
		//Typing Referral text into To Editbox
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("DEL");
		driver.findElement(By.xpath("//p[contains(.,'Indira Gandhi International Airport')]")).click();
		
		
		driver.findElement(By.xpath("(//p[contains(.,'27')])[1]")).click();
		
	}

}
