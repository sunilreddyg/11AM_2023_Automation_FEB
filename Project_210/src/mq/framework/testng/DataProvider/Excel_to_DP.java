package framework.testng.DataProvider;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_to_DP 
{
	String Filepath="TestData\\input.xlsx";
	String sheetname="Sheet2";
	XSSFWorkbook book;
	XSSFSheet sht;
	
	@DataProvider
	public String[][] GetData() throws Exception
	{
		//Target Workbook and sheet
		FileInputStream fi=new FileInputStream(Filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet(sheetname);
		
		//Find data availability in numbers or rows and cells
		int Rcount=sht.getLastRowNum();
		int CellCount=sht.getRow(0).getLastCellNum();
		//Creating double dimesion String array
		String data[][]=new String[Rcount+1][CellCount];
		
		//Iterate for number or rows in excel
		for (int i = 0; i <= Rcount ; i++) 
		{
			//Innerloop to iterate number of cell times
			for (int j = 0; j < CellCount; j++) 
			{
				//Assigning excel value to double dimension array
				data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		//returning double dimension array data to dataprovider method
		return data;
	}
	
	
	@Test(dataProvider="GetData")
	public void GetUserData(String UID,String EDU)
	{
		
	}

}
