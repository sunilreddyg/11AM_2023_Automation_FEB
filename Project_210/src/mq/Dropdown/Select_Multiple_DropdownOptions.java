package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_DropdownOptions 
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?");
		driver.manage().window().maximize();
		
		WebElement CityDropdown=driver.findElement(By.xpath("//select[@onchange='showothcity();fieldTrack(this);']"));
		
		//Converting Single selection dropdown into multiple selection dropdown using javascript
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('multiple','multiple')", CityDropdown);
		Thread.sleep(4000);
		
		
		boolean flag=new Select(CityDropdown).isMultiple();
		System.out.println("Dropdown multiple selection type is --> "+flag);
		
		if (flag) 
		{
			Select MultiSelector=new Select(CityDropdown);
			MultiSelector.deselectAll();
			MultiSelector.selectByIndex(3);
			MultiSelector.selectByIndex(5);
			MultiSelector.selectByIndex(9);
			
			//Get Selection Count
			int Count=MultiSelector.getAllSelectedOptions().size();
			System.out.println("Selection Count is ---> "+Count);
		
			
			//Deselect Single Option from Multiple Selection Dropdown
			MultiSelector.deselectByIndex(5);
			
			//Get Selection Count
			int DCount=MultiSelector.getAllSelectedOptions().size();
			System.out.println("Selection Count is ---> "+DCount);
			
		
		} 
		else
		{
			System.out.println("Dropdown is a single selection type");
		}
		
		
		
		
		
	}

}
