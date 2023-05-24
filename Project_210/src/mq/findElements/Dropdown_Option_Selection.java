package findElements;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Option_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Identifying Month dropdown and Collect All Options into List Interface
		WebElement Month_DD=driver.findElement(By.name("birthday_month"));
		
		//Finding list of  option tag under month dropdown
		List<WebElement> AllMonths=Month_DD.findElements(By.tagName("option"));
		
		
		if(AllMonths.size() > 0)
		{
				//Iterate for number of Options
				for (int i = 0; i < AllMonths.size(); i++) 
				{
					//Get Each Option using Index number
					WebElement EachOption=AllMonths.get(i);
					System.out.println(EachOption.getText());
					EachOption.click();
					Thread.sleep(500);
				}
		}
		else
		{
			System.out.println("methods Return zero");
		}
		
		
		
		
		
		
		
		
		
		//Identifying year dropdown and Collec All Options into List Interface
		WebElement Year_DD=driver.findElement(By.name("birthday_year"));
		
		//Get All Options under Select Elements
		List<WebElement> YearOptions=new Select(Year_DD).getOptions();
		
		
		if(YearOptions.size() > 0)
		{
				//Reading all object using foreach loop
				for (WebElement Eachoption : YearOptions) 
				{
					System.out.println(Eachoption.getText());
					Eachoption.click();
				}
		}
		else
		{
			System.out.println("Year Option Found zero");
		}
		
		
		
		//Identifying year dropdown and Collec All Options into List Interface
		WebElement Date_DD=driver.findElement(By.name("birthday_day"));
		for (WebElement EachData : new Select(Date_DD).getOptions()) 
		{
			EachData.click();
		}
		
		
		
		
		
	}

}
