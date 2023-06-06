package datadriven.propertyfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_PropertyFiles 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target file locatio
		FileInputStream fi=new FileInputStream("src\\datadriven\\propertyfiles\\InputData.properties");
		System.out.println("File located");
		
		//Create object for property files
		Properties repository=new Properties();
		//Load data to repository using file
		repository.load(fi);
		
		
		//Read value using keyname
		String UID=repository.getProperty("email");
		String PWD=repository.getProperty("password");
		String URL=repository.getProperty("url");
		
		System.out.println(UID+"   "+PWD+"   "+URL);
		
		
		

	}

}
