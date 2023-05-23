package mq.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) 
	{
		
		/*
		 * List store collection of objects with in order
		 * List accept duplicate values to store
		 */
		
		List<String> list=new ArrayList<String>();
		list.add("Iphone");
		list.add("Samsung");
		list.add("Vivo");
		list.add("Iphone");
		list.add("Oppo");
		list.add("OnePlus");
		
		//Remove single object for collection
		list.remove("Vivo");
		
		//Read any sigle object using index number[This Method only available for List]
		String Indexobj=list.get(3);
		System.out.println(Indexobj);
		
		//Method get Number of Units count available at collection
		int Count=list.size();
		System.out.println("Object Count is --> "+Count);
		
		//Add Single object to Collection
		list.add("Nokia");
		
		//Verify Object Presented at collection
		boolean flag=list.contains("Nokia");
		System.out.println("Is object available ? "+flag);
		
		//Read Next Iteratable object
		String First=list.iterator().next();
		System.out.println("First Iteratable object is --> "+First);
		
	
		//Check Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Is Collection is Empty ? "+flag1);
		
		//For list of objects to use we can use for loop
		for (int i = 0; i < list.size(); i++)
		{
			String value=list.get(i);
			System.out.println(value);			
		}
		
		
		
		
		//Read All Collection object using foreach loop
		for (String Eachlist : list) 
		{
			System.out.println("=>"+Eachlist);
		}
		
		//Read Objects From Collection Using while loop
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String Each=itr.next();
			System.out.println(Each);
		}
				

	}

}
