package datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_DataCell_Value 
{

	public static void main(String[] args) throws IOException 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Create object for excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above book
		XSSFSheet sht=book.getSheet("DataTypes");
		
		//get row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		
		//Read Date cell value
		Date date=row.getCell(2).getDateCellValue();
		String NewDate=new SimpleDateFormat("yyyy-MMM-dd").format(date);
		System.out.println(NewDate);

	}

}
