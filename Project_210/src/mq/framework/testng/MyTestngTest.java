package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngTest 
{
	  @Test //Invoke method to run
	  public void tc001() 
	  {
		  Reporter.log("Browser Opened",true);
	  }
	  
	  @Test //Invoke method to run
	  public void tc002() 
	  {
		  Reporter.log("login completed",true);
	  }
	  
	  @Test //Invoke method to run
	  public void tc003() 
	  {
		  Reporter.log("Browser Closed",true);
	  }
}
