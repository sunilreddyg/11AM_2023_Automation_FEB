package framework.junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	@BeforeClass //Invoke before execution of first Test
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class PreCondition");
	}

	@AfterClass  //Invoke after execution of last test
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class Postcondition");
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

}
