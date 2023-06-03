package datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_NumberofCellsData 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Create object for excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above book
		XSSFSheet sht=book.getSheet("multilecells");
		
		
		for (int i = 0; i <= sht.getLastRowNum(); i++) 
		{
		
			int LcellNum=sht.getRow(i).getLastCellNum();
			
			for (int j = 0; j < LcellNum; j++) 
			{
				String CellValues=sht.getRow(i).getCell(j).getStringCellValue();
				System.out.println(CellValues);

			}
		}
		
		
		
		

	}

}
