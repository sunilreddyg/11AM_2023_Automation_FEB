package pageobjects.withoutpagefactory;

import org.junit.Ignore;
import org.junit.Test;

public class RunTest 
{

	@Ignore
	public void test1() 
	{
		TestCase1 tc1=new TestCase1();
		tc1.Tc001_Add_AdminSystemUser();
	}
	
	@Ignore
	public void test2() 
	{
		TestCase2 tc2=new TestCase2();
		tc2.AddEmployeeList_UnderPIM();
	}
	
	@Test
	public void test3()
	{
		TestCaseWithKeywords TK=new TestCaseWithKeywords();
		TK.TestCaseAddingSystmeUser();
	}

}
