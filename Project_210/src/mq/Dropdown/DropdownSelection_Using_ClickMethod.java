package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelection_Using_ClickMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Identifying Child element under parent element
		WebElement DOB_Day=driver.findElement(By.id("day"));
		DOB_Day.findElement(By.xpath("//option[@value='26'][contains(.,'26')]")).click();
		
		
		WebElement DOB_Month=driver.findElement(By.xpath("//option[@value='10'][contains(.,'Oct')]"));
		DOB_Month.click();
		
	}
}
