package mq.java.methods.parameters.callbyReference;

public class Product1 
{
	double price=25000.00;
	
	void getProductPrice(String Name)
	{
		System.out.println(Name+"    "+price);
	}

}
