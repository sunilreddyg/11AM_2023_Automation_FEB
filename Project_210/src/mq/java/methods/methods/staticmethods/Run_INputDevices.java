package mq.java.methods.staticmethods;

public class Run_INputDevices 
{

	public static void main(String[] args) 
	{
		//Calling Static methods from Different class
		// Syntax:-->    Classname.methodname;
		InputDevices.keyboard();
		InputDevices.mouse();
		
		
		//Calling Instant method from different class
		//Syntax:-->  new Classname().methodname();
		new InputDevices().touch();

	}

}
