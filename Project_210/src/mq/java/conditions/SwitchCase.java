package mq.java.conditions;

public class SwitchCase {

	public static void main(String[] args) 
	{
		
		int month=4;
		switch (month) 
		{
		case 1:
			System.out.println("10% Discount");
			break;
			
		case 2:
			System.out.println("20% Discount");
			break;
			
		case 3:
			System.out.println("30% Discount");
			break;
			
		case 4:
			System.out.println("40% Discount");
			break;

		default:
			System.out.println("Month name Not matching");
			break;
		}
		

	}

}
