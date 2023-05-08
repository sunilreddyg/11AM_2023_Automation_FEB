package exceptions_java;

import java.io.File;

public class Throw_Exception 
{

	public static void main(String[] args) throws Exception 
	{
		
		File fi;
		try {
			fi=new File("C:\\Images1.png");
		} catch (Exception e) {
			throw new Exception("Because of Slow Performance");
		}
	}

}
