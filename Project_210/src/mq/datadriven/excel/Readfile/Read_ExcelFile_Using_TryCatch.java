package datadriven.excel.Readfile;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_ExcelFile_Using_TryCatch 
{

	public static void main(String[] args) 
	{
		FileInputStream fi = null;
		XSSFWorkbook book = null;
		try {
			fi=new FileInputStream("TestData\\InputData.xlsx");
			System.out.println("file located");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(fi!=null)
		{
			try {
				book=new XSSFWorkbook(fi);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(book!=null)
		{
			//Read data from book
			String URL=book.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
			System.out.println(URL);
		}
		
		

	}

}
