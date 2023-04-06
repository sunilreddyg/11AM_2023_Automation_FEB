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
	
	//Integer return method
	public int method3()
	{
		return 100;
	}
	
	//Integer return method
	public int total(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	//Double return method
	public double getprice()
	{
		double price=23000.00;
		return price;
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
		
		//Calling double return method
		double price=obj.getprice();
		System.out.println(price);
	}

}
