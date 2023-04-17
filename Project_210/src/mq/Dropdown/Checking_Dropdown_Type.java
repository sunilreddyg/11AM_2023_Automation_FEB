package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checking_Dropdown_Type 
{

	public static void main(String[] args) throws Exception {
		
		//How to verify dropdown is single or multiple selection type
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?");
		driver.manage().window().maximize();
		
		
		WebElement CityDropdown=driver.findElement(By.xpath("//select[@onchange='showothcity();fieldTrack(this);']"));
		
		
		
		boolean flag=new Select(CityDropdown).isMultiple();
		System.out.println("Dropdown multiple selection type is --> "+flag);
		
		
		//Converting Single selection dropdown into multiple selection dropdown using javascript
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('multiple','multiple')", CityDropdown);
		Thread.sleep(4000);
		
		boolean flag1=new Select(CityDropdown).isMultiple();
		System.out.println("Dropdown multiple selection type is --> "+flag1);
		
		
		
		
		
		
	}

}
