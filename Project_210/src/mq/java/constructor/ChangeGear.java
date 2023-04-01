package mq.java.constructor;


public class ChangeGear 
{

	public ChangeGear() 
	{
		System.out.println("Holding Clutch");
	}
	
	public void ChangeToFirstGear() 
	{
		System.out.println("Gear Changed to First");
	}
	
	public void ChangeToSecondGear()
	{
		System.out.println("Gear Changed to Second");
	}
	

	public void ChangeToThirdGear()
	{
		System.out.println("Gear Changed to Third");
	}
	

	public static void main(String[] args) 
	{
		//Calling Class Constructor   [new Classname();]
		new ChangeGear();
		
		//Calling instant method using Class Constructor
		new ChangeGear().ChangeToFirstGear();
		new ChangeGear().ChangeToSecondGear();
		new ChangeGear().ChangeToThirdGear();
		
		
		ChangeGear car=new ChangeGear();
		car.ChangeToFirstGear();
		car.ChangeToSecondGear();
		car.ChangeToThirdGear();
		
	}
	
}

