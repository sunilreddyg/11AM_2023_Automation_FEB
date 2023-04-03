package mq.java.methods.parameters.callbyvalue;

public class LocalParameters 
{
    //Method without parameter
	public void method1()
	{
		System.out.println("No Value");
	}
	
	//Method with Integer parameter
	public void method2(int num)
	{
		System.out.println(num);
	}
	
	//Method with String parameter
	public void method3(String phonename)
	{
		System.out.println(phonename);
	}
	
	//Method with Double parameter
	public void method4(double price)
	{
		System.out.println(price);
	}
	
	//Method with boolean parameter
	public void method5(boolean flag) 
	{
		System.out.println(flag);
	}

	public static void main(String[] args) 
	{
		LocalParameters obj=new LocalParameters();
		
		//Calling method without arguments
		obj.method1();
		
		//Calling method with integer argument
		obj.method2(10);
		
		//Calling method with String argument
		obj.method3("samsung");
		obj.method3("iphone");
		
		//Calling method with double argument
		obj.method4(25000.25);
		obj.method4(10000);
		
		//Calling method with boolean argument
		obj.method5(true);
		
		
		
	}

}
