package switchCommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_TryCatch 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    try {
			driver.switchTo().alert().accept();
			System.out.println("alert is Closed");
		} catch (Exception e) {
			System.out.println("No Alert");
			e.printStackTrace();
		}
	    
	    System.out.println("Run Continued");

	}

}
