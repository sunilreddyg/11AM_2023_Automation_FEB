package mq.java.methods.TypesofMethods.CallByReference;

public class ChooseProduct 
{
	
	public Book1 selectFirstBook()
	{
		return new Book1();
	}
	
	public Book2 selectSecondBook()
	{
		return new Book2();
	}
	
	
	public static void main(String[] args)
	{
		
		ChooseProduct obj=new ChooseProduct();
		
		//Calling void method
		obj.selectFirstBook().printDetails();
		
		//Calling Double return method
		double newprice=obj.selectFirstBook().getPrice();
		System.out.println(newprice);
		
	
		Book1 b1=obj.selectFirstBook();
		String Name=b1.getName();
		System.out.println(Name);
		
		double offerprice=obj.selectFirstBook().GetDiscount().Book1FinalPrice();
		System.out.println(offerprice);
		
	}
	
}
