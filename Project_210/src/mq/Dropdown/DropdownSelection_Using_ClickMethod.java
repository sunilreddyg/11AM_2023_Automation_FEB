package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelection_Using_ClickMethod 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		/*
		 * => Identifying Parent Object   [Select Tag Element]
		 * => Identifying Child Object under parent object  [Option Tag Element]
		 * => Then we used click optiont select one of dropdown option
		 */
		
		
		WebElement DOB_Day=driver.findElement(By.id("day"));
		DOB_Day.findElement(By.xpath("//option[@value='26'][contains(.,'26')]")).click();
		
		
		/*
		 * => I Copied direct xpath of Dropdown Option [Option tag xpath]
		 * => Then I Located element and perform click action
		 */
		WebElement DOB_Month=driver.findElement(By.xpath("//option[@value='10'][contains(.,'Oct')]"));
		DOB_Month.click();
		
	}
}
