package mq.java.methods.TypesofMethods;


public class MethodTypes 
{
	//Void type :--> Method doesn't return any value
	public void method1() 
	{
		System.out.println("Nothing -----");
	}
	
	/*
	 * => Other than all method types return values
	 * => Other than void for all methods we should write return keyword
	 * => return keyword should be writen at end of the method
	 * => Other than void we can write [Datatypes,Classes  --etc]
	 * => Return value should match with method type\
	 * => Finally value return into methodname
	 */
	public String method2()
	{
		return "Samsung";
	}
	
	public int method3()
	{
		return 100;
	}
	
	public int total(int a, int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		MethodTypes obj=new MethodTypes();
		obj.method1();
		
		//Calling String Return method
		String name=obj.method2();
		System.out.println(name);

		//Calling Integer return method
		int x=obj.total(120, 300);
		System.out.println("total value is-->  "+x);
	}

}
