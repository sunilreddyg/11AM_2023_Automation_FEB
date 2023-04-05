package mq.java.variables;

public class Final_Keyword 
{
	
	public static int a=100;
	public static final int b=300;
	//Final keyword doesn't allow runtime changes to variable

	public static void main(String[] args) 
	{
		//Varible is override type it accept changes at runtime
		 int x=Final_Keyword.a=200;
		 System.out.println(x);
		

	}

}
