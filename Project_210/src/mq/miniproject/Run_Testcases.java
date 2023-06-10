package miniproject;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Run_Testcases extends TestCases
{
  @Test
  public void CheckLoginPage() 
  {
	  Tc001_HrmLogin();
	  Assert.assertTrue(verify_text_presented_At_location(obj_Dashboard, "Dashboard"));
  }
}
