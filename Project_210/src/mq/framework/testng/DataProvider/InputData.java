package framework.testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider = "login",enabled=false)
  public void testlogin(String uid,String pwd) 
  {
	  
  }

  @DataProvider
  public Object[][] login() 
  {
    return new Object[][] 
    {
      new Object[] {"Ajay","90302455"},
      new Object[] {"Arvind","23452455"},
    };
  }
  
  
   @DataProvider
   public String[][] info()
   {
	   	   String data[][]=
		   {
				   {"iphone","256GB"},
				   {"samsung","64GB"},
				   {"Oneplus","124GB"},
		   };
	   return data;
   }
  
  @Test(dataProvider="info")
  public void VerifyPhone(String phonename,String Config)
  {
	  System.out.println(phonename+"   "+Config);
  }
  
  
  @DataProvider
  public Object[][] productinfo() 
  {
    return new Object[][] 
    {
      new Object[] {"iphone",35000.00,true,3},
      new Object[] {"vivo",25000.00,true,1},
      new Object[] {"oppo",26000.00,false,0},
      
    };
  }
  
}
