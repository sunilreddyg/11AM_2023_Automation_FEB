package browserlaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Launching firefox browser and storing into reference class
		FirefoxDriver firefox=new FirefoxDriver();
		
		//Loading Webpage to Current browser window
		firefox.get("https://google.com");
		
		//Printng Current Window title
		System.out.println(firefox.getTitle());
		
		//Hold execution for given time
		Thread.sleep(4000);     //Time must be define in milliseconds
		
		//Close Browser
		firefox.close();
}

}
