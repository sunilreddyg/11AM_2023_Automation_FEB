package datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_NumericCell {

	public static void main(String[] args) throws IOException
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target Sheet
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get row using above sheet
		XSSFRow row=sht.getRow(1);
		
		//Get Numeric Cell value
		double ID_in_Dble=row.getCell(0).getNumericCellValue();
		System.out.println(ID_in_Dble);
		
		//Autoboxing primitve to Non primitive
		Double dble=new Double(ID_in_Dble);
		int NewID=dble.intValue();
		System.out.println(NewID);
		
		//Using POI method converted number value to text format
		String StrID=NumberToTextConverter.toText(ID_in_Dble);
		System.out.println("EMPID in String format ---> "+StrID);
		
		
		//Read Mobile number
		//By adding single inverted comma we can convert numeric cell to text cell
		String mobile=row.getCell(1).getStringCellValue();
		System.out.println(mobile);
		
		//Read salary from Excel cell 
		//BY Deafault excel read numers in double format
		double price=row.getCell(2).getNumericCellValue();
		System.out.println("price in dble format ---> "+price);
		
	}

}
