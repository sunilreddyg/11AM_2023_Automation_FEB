package mq.java.variables;

public class VariableTypes 
{
	//Global Variables   [Instant Variables]  [Package Variables]
	int a=100;
	String toolname="Selenium";
	
	//Global Variables   [Static Variables]	  [Package Variables]
	static int b=200;
	static String email="sunilreddy@mindqsystems.com";
	
	public void method1()
	{
		//Local Variable
		int num=100;
		String name="Webdriver";
		System.out.println(a+b);
	}
	
	public void method2()
	{
		System.out.println(a);   //Printing global varaibles
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		//Calling Instant Variables
		VariableTypes types=new VariableTypes();
		int x=types.a;
		System.out.println(x);
		
		String tname=types.toolname;
		System.out.println(tname);
		
		//Calling Static variables
		int y=VariableTypes.b;
		System.out.println(y);
		
		System.out.println(VariableTypes.email);

	}

}
