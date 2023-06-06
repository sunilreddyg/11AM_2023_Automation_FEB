package datadriven.propertyfiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SetProperties 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		//Create object for properties
		Properties obj=new Properties();
		
		//Set Data to Repository
		obj.setProperty("Iphone", "true");
		obj.setProperty("Samsung", "false");
		obj.setProperty("oneplus", "true");
		
		
		//Create output file
		String filepath="src\\datadriven\\propertyfiles\\Output.properties";
		FileOutputStream fo=new FileOutputStream(filepath);
	
		//Storing runtime data to property file
		obj.store(fo, "Product available status");
		
		
		

	}

}
