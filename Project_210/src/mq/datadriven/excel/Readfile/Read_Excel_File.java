package datadriven.excel.Readfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_File {

	public static void main(String[] args) throws IOException 
	{
		
		//Reading file using checked exception
		File f=new File("TestData\\InputData.xlsx");
		FileInputStream fi=new FileInputStream(f);
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		String Browser=book.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
		System.out.println(Browser);
	}

}
