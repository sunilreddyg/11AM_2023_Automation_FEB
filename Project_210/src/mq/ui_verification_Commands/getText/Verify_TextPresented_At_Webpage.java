package ui_verification_Commands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_TextPresented_At_Webpage {

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://facebook.com/reg"
		 * 		When User Click Signup Button without Enter Details 
		 * 		Then verify error lable displayed "What's your name?"
		 */
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		WebElement Signup_btn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		//Signup_btn.click();
		Thread.sleep(3000);
		
		
		//Identify Page
		WebElement Page=driver.findElement(By.tagName("body"));
		//Get overall visible text presented at webpage
		String PageText=Page.getText();
		
		/*
		 * Note:--. GetText capture only visible text presented at UserInterface
		 */
		
		if(PageText.contains("What's your name?"))
			System.out.println("Testpass, Text Visible at webpage");
		else
			System.out.println("Testfail, Text Not visible at webpage");
	}

}
