package datadriven.csvfiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class CsvFiles_Read_Data_Using_List {

	public static void main(String[] args) throws IOException {
	
		//Target file location
		FileReader fr=new FileReader("src\\datadriven\\csvfiles\\input.csv");
		System.out.println("File is Located");
		
		//Create object for csvreader
		CSVReader reader=new CSVReader(fr);
		
		//Reading all data to List of string array
		List<String[]> list=reader.readAll();
		
		//Read all records using csv files
		for (String[] Record : list) 
		{
			System.out.println(Record[0]+"   "+Record[1]);
		}
	}

}
