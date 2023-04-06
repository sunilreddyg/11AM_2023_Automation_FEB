package mq.java.methods;

public class Static_And_InstantMethods 
{
	//instant method
	public void m1() 
	{
		System.out.println("m1 Executed");
		m2();
		
		//Static is power user You can call at instant method directly
		m3();
		m4();
	}
	
	//instant method
	public void m2() 
	{
		System.out.println("m2 Executed");
	}
	
	//static methods
	public static void m3() 
	{
		new Static_And_InstantMethods().m2();
		System.out.println("m3 Executed");
	}
	
	//static methods
	public static void m4() 
	{
		new Static_And_InstantMethods().m2();
		System.out.println("m4 Executed");
	}



	public static void main(String[] args) 
	{
	      new Static_And_InstantMethods().m1();
	     

	}

}
