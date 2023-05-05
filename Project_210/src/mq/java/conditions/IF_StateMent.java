package mq.java.conditions;

public class IF_StateMent 
{

	public static void main(String[] args) 
	{
		
		/*
		 * IF:--> 
		 * 		if a single decision statement. On True
		 * 		Condition It execute specific block of code
		 */
		
	
		System.out.println("Statement1");
		
		int a=10;
		if (a == 10)   //Here greaterthan symbol return boolean value
		{
			System.out.println("Statement2");
		}
		
		System.out.println("Statement3");
		
		//Under if condition any single statement we can define without using block {}
		if(a!=10)
			System.out.println("A value is not matching");
		
		
		System.out.println("Statement 4");
	}

}
