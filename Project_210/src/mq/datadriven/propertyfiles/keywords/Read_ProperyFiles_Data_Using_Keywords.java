package datadriven.propertyfiles.keywords;

import library.CommonActions;

public class Read_ProperyFiles_Data_Using_Keywords 
{

	public static void main(String[] args) 
	{
			
		String Browsername=Read_propertyFile.getProperty("browser");
		CommonActions actions=new CommonActions();
		actions.LaunchBrowser(Browsername);
		
		String url=Read_propertyFile.getProperty("application_url");
		actions.LoadPage(url);
		
		
	
	}

}
