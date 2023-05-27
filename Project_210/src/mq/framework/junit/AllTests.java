package framework.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses
	({  Asserts_In_Junit.class, 
		BeforeClass_And_AfterClass.class, 
		BeforeMethod_And_AfterMethod.class,
		IgnoreAllTest.class, IgnoreTest.class, 
		MyJunitTest.class ,
		AllTests.class
	})
public class AllTests 
{

}
