package robot_Window_Automaton;


import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_popUp_handling {

	public static void main(String[] args) throws Exception 
	{
		
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.irctc.co.in/nget/train-search");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   
		   
		   Robot robot=new Robot();
		   robot.setAutoDelay(1000);
		   
		   robot.mouseMove(300, 166);
		   
		   robot.mousePress(InputEvent.BUTTON1_MASK);
		   robot.mouseRelease(InputEvent.BUTTON1_MASK);
		   
		   
		   //Mouse wheel
		   robot.mouseWheel(300);
	}

}
