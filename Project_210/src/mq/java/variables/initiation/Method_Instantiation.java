package mq.java.variables.initiation;

public class Method_Instantiation 
{
	
	
	int a;
	int b;
	
	public void method1(int x, int y)
	{
		int a=x;
		int b=y;
	}
	
	public void method2()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		Method_Instantiation obj=new Method_Instantiation();
		obj.method1(20, 30);
		obj.method2();

	}

}
