package mq.java.methods.parameters.callbyReference;

public class CheckProduct 
{
	//Method parameter using call by reference
	public void GetFirstProduct(Product1 obj)
	{
		obj.getProductPrice("iphone");
	}
	
	//Method parameter using call by reference
	public void GetSecondProduct(Product2 obj)
	{
		obj.getProductPrice("Samsung");
	}
	

	public static void main(String[] args) 
	{
		
		//Passing object as an argument..
		CheckProduct status=new CheckProduct();
		status.GetFirstProduct(new Product1());
		status.GetSecondProduct(new Product2());

	}

}
