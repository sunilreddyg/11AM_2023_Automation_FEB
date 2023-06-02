package datadriven.excel.keywords;

public class Run_Excel_commands {

	public static void main(String[] args) 
	{
		
	
		 ExcelCommonActions.getExcel("InputData.xlsx", "config");
		 
		 //Using reusable keyword red cell data
		 String Browser=ExcelCommonActions.readcelldata(1, 0);
		 System.out.println(Browser);
		 
		 //Using Reusable keyword target cell
		 boolean flag=ExcelCommonActions.targetcell(1, 3).getBooleanCellValue();
		 System.out.println(flag);
	}

}
