package mq.java.methods.staticmethods;

public class InputDevices 
{

	//Static Specifier method
	public static void mouse() 
	{
		System.out.println("Mouse is active");
	}
	
	//Static Specifier method
	public static void keyboard() 
	{
		System.out.println("Keyboard is active");
	}
	
	//Instant method
	public void touch()
	{
		System.out.println("Touch is Active");
	}

	

	public static void main(String[] args) 
	{
		//With In same class Calling Static methods
		mouse();
		keyboard();
		
		//Calling Instant Method 
		new InputDevices().touch();

	}

}
