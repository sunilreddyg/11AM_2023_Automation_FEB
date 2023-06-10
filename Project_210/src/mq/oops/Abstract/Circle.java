package oops.Abstract;

public class Circle extends Shape
{

	@Override
	void draw() 
	{
		System.out.println("Drawing circel");
	}
	
	
	public static void main(String[] args) 
	{
		Shape obj=new Circle();
		obj.draw();
		obj.corners();
		
		
		//Calling static varaible form abstract class
		System.out.println(Shape.name);
		
		
	}

}
