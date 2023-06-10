package oops.Encapsulation;

import java.util.Date;

public class Encaps 
{
	//Private variable can't access outside the class
	private String name;
	private String email;
	public String EMPID="MQ001";
	

	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
		System.out.println(new Date().toString());
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}





	

}
