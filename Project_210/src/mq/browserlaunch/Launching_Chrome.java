package browserlaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Chrome 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Open Chrome browser and Storing into Reference Class
		ChromeDriver chrome=new ChromeDriver();
		
		//Loading Page to Browser Window
		chrome.get("https://www.facebook.com/");
		
		//Fetching page title from current window
		String PageTitle=chrome.getTitle();
		System.out.println(PageTitle);
		
		//Hold execution for given time
		Thread.sleep(4000);     //Time must be define in milliseconds
		
		//Close Browser
		chrome.close();
		
		
	}

}
