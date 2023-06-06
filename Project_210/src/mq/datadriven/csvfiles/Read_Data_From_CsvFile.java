package datadriven.csvfiles;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFile {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileReader fr=new FileReader("src\\datadriven\\csvfiles\\input.csv");
		System.out.println("File located");
		
		CSVReader reader=new CSVReader(fr);
		
		//Read First Record
		String Rec1[]=reader.readNext();
		System.out.println(Rec1[0]+"      "+Rec1[1]);
		
		//Read Second Record
		String Rec2[]=reader.readNext();
		System.out.println(Rec2[0]+"    "+Rec2[1]);
		
		
		String Records[];
		while((Records=reader.readNext())!=null)
		{
			System.out.println(Records[0]+"   "+Records[1]);
		}
		
		
	}

}
