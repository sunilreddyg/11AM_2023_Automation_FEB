package datadriven.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Data_From_multiple_Rows {

	public static void main(String[] args) throws IOException {
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Create object for excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above book
		XSSFSheet sht=book.getSheet("groupdata");
		
		
		//Get Start and End row count
		int Frnum=sht.getFirstRowNum();
		System.out.println("Row Number where exactly data started ---> "+Frnum);
		
		int Lrnum=sht.getLastRowNum();
		System.out.println("Row Number where exactly data ended --> "+Lrnum);
		
		
		for (int i = Frnum+1; i <= Lrnum; i++) 
		{
			 String UID=sht.getRow(i).getCell(0).getStringCellValue();
			 String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			 System.out.println(UID+"   "+PWD);
		}
		

	}

}
