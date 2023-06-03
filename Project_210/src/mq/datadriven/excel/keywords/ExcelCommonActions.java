package datadriven.excel.keywords;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCommonActions 
{
	static String filepath="TestData\\";
	static XSSFWorkbook book;
	static XSSFSheet sht;
	
	public static XSSFSheet getExcel(String Filename,String sheetname)
	{
		try {
			FileInputStream fi=new FileInputStream(filepath+Filename);
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(sheetname);
			return sht;
		} catch (Exception e) {
			return null;
		}
	}
	
	
	public static String readcelldata(int row, int col)
	{
		return sht.getRow(row).getCell(col).getStringCellValue();
	}
	
	public static XSSFCell targetcell(int row, int col)
	{
		return sht.getRow(row).getCell(col);
	}
	
	public static boolean readbooleandata(int row, int col)
	{
		return targetcell(row, col).getBooleanCellValue();
	}
	
	

}
