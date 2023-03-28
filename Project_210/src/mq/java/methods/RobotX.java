package mq.java.methods;

public class RobotX 
{
	//Reusable method
	public void Turnon() 
	{
		System.out.println("Robot is ON");
	}
	
	//Reusable method
	public void Sleep() 
	{
		System.out.println("Robot is OFF");
	}
	
	//Reusable method
	public void Walk() 
	{
		System.out.println("Robot is Walking");
	}

	
	//Runnable method
	public static void main(String[] args) 
	{
		System.out.println("I am Running");
		
		new RobotX().Turnon();
		new RobotX().Walk();
		new RobotX().Sleep();
	}

}
