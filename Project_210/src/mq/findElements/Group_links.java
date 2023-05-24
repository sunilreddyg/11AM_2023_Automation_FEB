package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		
		//Identifying Group location and Finding list of links availale
		WebElement TrendingTabs=driver.findElement(By.id("trending-naukri-wdgt"));
		List<WebElement> AllLinks=TrendingTabs.findElements(By.className("ntc__chip-wrapper"));
		
		
		for (int i = 0; i < AllLinks.size(); i++) 
		{
			//Get Each link using index number
			WebElement EachLink=AllLinks.get(i);

			
			//Read Linkname and href
			String LinkName=EachLink.getText();
			String Linkhref=EachLink.getAttribute("href");
			System.out.println(LinkName+"    "+Linkhref);
			
			//Click Each Link
			EachLink.click();
			Thread.sleep(3000);
			
			
			String Mainwindow=driver.getWindowHandle();
			for (String EachWIndowId : driver.getWindowHandles()) 
			{
				if(!Mainwindow.equals(EachWIndowId))
				{
					driver.switchTo().window(EachWIndowId);
					if(driver.getCurrentUrl().contains(Linkhref))
					{
						System.out.println(LinkName+"----> Page Verified");
					}
					else
					{
						System.out.println(LinkName+"----> Page not Verified");
					}
					
					//Close focused window
					driver.close();
					
					break;
				}
				
			}
			
			Thread.sleep(3000);
			driver.switchTo().window(Mainwindow);
			//System.out.println(driver.getTitle());
		
		}
		
		
		
		
		
		
		
		
	}

}
