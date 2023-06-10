package oops.Encapsulation;

public class RunEncaps {

	public static void main(String[] args) 
	{
	   Encaps obj=new Encaps();
	   
	   //Printing public variable
	   System.out.println(obj.EMPID);
	   
	  //Overriding public variable
	   String NewID=obj.EMPID="MQ002";
	   System.out.println(NewID);
	   
	   //Calling Setter and Getter methods
	   obj.setName("Vijay");
	   String MYname=obj.getName();
	   System.out.println(MYname);
	   
	   obj.setEmail("infovijay@gmail.com");
	   System.out.println(obj.getEmail());

	}

}
