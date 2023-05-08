package exceptions_java;


import java.io.FileInputStream;
import java.io.IOException;

public class Checked_Exceptions {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.out.println("Statement1");
		Thread.sleep(5000);
		System.out.println("Statement2");
		
		FileInputStream  file=new FileInputStream("Data");
		System.out.println("File is Located");

	}

}
