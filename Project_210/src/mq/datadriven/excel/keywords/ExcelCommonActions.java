package datadriven.excel.keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCommonActions 
{
	static String filepath="TestData\\";
	static XSSFWorkbook book;
	static XSSFSheet sht;
	
	
	//Target Selected file and sheet then return sheet controls to method
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
	
	
	//Method Return String Data from selected row and selected cell
	public static String readcelldata(int row, int col)
	{
		return sht.getRow(row).getCell(col).getStringCellValue();
	}
	
	//It target seleced and cell then return control to method
	public static XSSFCell targetcell(int row, int col)
	{
		return sht.getRow(row).getCell(col);
	}
	
	//Using row and cell read boolean value at cell
	public static boolean readbooleandata(int row, int col)
	{
		return targetcell(row, col).getBooleanCellValue();
	}
	
	
	/*
	 * keyword:--> Get Number of Rows Date available
	 * Description:-->
	 */
	public static int GetRowCount()
	{
		return sht.getLastRowNum();
	}
	
	
	/* 
	 *  Keyword:--> Write Cell Data
	 * Description:-->
	 */
	public static void WriteData_NewRow_And_Newcell(int row, int cell,String text)
	{
		sht.createRow(row).createCell(cell).setCellValue(text);
	}
	
	
	
	/* 
	 *  Keyword:--> Write Cell Data
	 * Description:-->
	 */
	public static void WriteData_At_exsitingRow_And_NewCell(int row, int cell,String text)
	{
		sht.getRow(row).createCell(cell).setCellValue(text);
	}
	
	
	
	
	
	/* 
	 *  Keyword:--> Crete output file and Dump all to otuput file
	 * Description:-->
	 */
	public static void CreateOtuputFile(String Ofilename)
	{
		try {
			FileOutputStream fo=new FileOutputStream(filepath+Ofilename);
			book.write(fo);
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
