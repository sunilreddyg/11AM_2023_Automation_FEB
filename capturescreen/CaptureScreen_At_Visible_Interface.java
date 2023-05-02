package capturescreen;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_At_Visible_Interface {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();    
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    //Catpure screen and converting screen into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.createDir(new File("Screens\\"));
	    FileHandler.copy(src, new File("Screens\\image.png"));
	    
	    /*
	     * PNG[Portable network graphic]  --> Image extension
	     */
	}

}
