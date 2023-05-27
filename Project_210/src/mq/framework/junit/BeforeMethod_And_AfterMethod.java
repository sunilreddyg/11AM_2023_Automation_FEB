package framework.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_AfterMethod 
{

	@Before //Invoke evey @Test annotation before
	public void setUp() throws Exception 
	{
		System.out.println("Test PreCondition");
	}

	@After //Invoke every @Test annotation after
	public void tearDown() throws Exception 
	{
		System.out.println("Test PostCondition");
	}

	@Test  //Invoke method to run
	public void test1() 
	{
		System.out.println("test1 Executed");
	}
	
	@Test  //Invoke method to run
	public void test2() 
	{
		System.out.println("test2 Executed");
	}
	
	@Test  //Invoke method to run
	public void test3() 
	{
		System.out.println("test3 Executed");
	}


}
