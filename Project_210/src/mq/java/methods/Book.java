package mq.java.methods;

public class Book
{
	
	public void author() 
	{
		System.out.println("shiva");
	}
	   
	public void title() 
	{
		System.out.println("selinium");
	}
	
	public void heading() 
	{
		System.out.println("methods");
	}
	public void details()
	{
		author();
		title();
		heading();
	}
	
	public static void main(String[] args)
	{
	   new Book().details();
	}
}
