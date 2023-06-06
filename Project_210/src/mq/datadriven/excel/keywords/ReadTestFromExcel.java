package datadriven.excel.keywords;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTestFromExcel 
{
	XSSFSheet sht;
	WebDriver driver;
	String url="http://outlook.com";
	
	By signin=By.xpath("(//a[contains(.,'Sign in')])[1]");
	By email=By.xpath("//input[@id='i0116']");
	By next=By.xpath("//input[@id='idSIButton9']");
	
	@Before
	public void setUp() throws Exception 
	{
		sht=ExcelCommonActions.getExcel("InputData.xlsx", "Tests");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void test() throws Exception 
	{
		int Rcount=ExcelCommonActions.GetRowCount();
		for (int i = 1; i <= Rcount; i++) 
		{
			String Exe_Status=ExcelCommonActions.readcelldata(i, 3);
			if(Exe_Status.equalsIgnoreCase("y"))
			{
					String testname=ExcelCommonActions.readcelldata(i, 0);
					String Input=ExcelCommonActions.readcelldata(i, 1);
					String ExpRes=ExcelCommonActions.readcelldata(i, 2);
					
					driver.findElement(signin).click();
					driver.findElement(email).sendKeys(Input);
					driver.findElement(next).click();
					
					Thread.sleep(5000);
					String PageText=driver.findElement(By.tagName("body")).getText();
					if(PageText.contains(ExpRes))
					{
						ExcelCommonActions.WriteData_At_exsitingRow_And_NewCell(i, 4, "Testpass");
						System.out.println(testname+"              "+"Testpass");
					}
					else
					{
						ExcelCommonActions.WriteData_At_exsitingRow_And_NewCell(i, 4, "Testfail");
						System.out.println(testname+"              "+"Testfail");
					}
						
					
			}
		}
		
		//We should write outside loop
		ExcelCommonActions.CreateOtuputFile("TestOutput.xlsx");
		
	}

}
