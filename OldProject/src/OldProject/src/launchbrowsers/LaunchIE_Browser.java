package launchbrowsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE_Browser {

	public static void main(String[] args) {
		/*
		 * Download IEDriverServer.exe file
		 * 		=> URL:--> https://www.selenium.dev/downloads/
		 * 		=> Find The internet Explorer driver server
		 * 		=> Select Hotspot size  [32 bit  or 64 bit]
		 * 		=> download zip format file
		 * 		=> After download unzip file into backup folder
		 * 		
		 * 		Additional configurations:-->
		 * 				IE browser versions:-->  8,9,10,11 --etc
		 * 				Browser zoom level should be 100
		 * 				All privacy and security setting should be disabled
		 * 				Location of Privacy and Securities:-->
		 * 						Tools ---> InternetOptions
		 * 						--> Select Security tab
		 * 						--> Uncheck protected mode..
		 * 
		 * 			=> Before launch ie browser don't forgot
		 * 				to set runtime environment variables
		 * 				
		 */
	
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		System.out.println(ie.getTitle());
		
		ie.close();
	}

}
