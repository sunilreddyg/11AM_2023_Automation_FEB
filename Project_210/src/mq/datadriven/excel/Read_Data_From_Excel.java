package datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		//Target Excel file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook Access using above file input
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheet("config");
		
		//Get Row access using above sheet
		XSSFRow row=sht.getRow(1);
		
		//Get Cell Data using above row
		XSSFCell cell=row.getCell(0);
			
		//Get string data from cell
		String browsername=cell.getStringCellValue();
		System.out.println(browsername);
		
		//using row referrence read cell data
		String URL=row.getCell(1).getStringCellValue();
		System.out.println(URL);
		
		//Using Sheet Reference read cell data
		String OS=sht.getRow(1).getCell(2).getStringCellValue();
		System.out.println(OS);
	}

}
