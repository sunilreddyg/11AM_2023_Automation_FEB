package objectidentification.cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_CssSelector 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().setSize(new Dimension(1020, 800));
		
		driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("Krishna");
		
		
		
	}

}
