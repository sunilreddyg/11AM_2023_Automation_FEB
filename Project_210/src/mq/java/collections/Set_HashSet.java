package mq.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Set_HashSet {

	public static void main(String[] args) {
		
		/*
		 * Set is a unodert collection of objects
		 * Set avoid duplicate values to store
		 */
		
		
		Set<String> mobile=new HashSet<String>();
		mobile.add("iphone");
		mobile.add("Samsung");
		mobile.add("Vivo");
		mobile.add("iphone");
		mobile.add("Oppo");
		mobile.add("OnePlus");
		
		
		
		//Remove single object for collection
		mobile.remove("Vivo");
		
		//Method get Number of Units count available at collection
		int Count=mobile.size();
		System.out.println("Object Count is --> "+Count);
		
		//Add Single object to Collection
		mobile.add("Nokia");
		
		//Verify Object Presented at collection
		boolean flag=mobile.contains("Nokia");
		System.out.println("Is object available ? "+flag);
		
		//Read Next Iteratable object
		String First=mobile.iterator().next();
		System.out.println("First Iteratable object is --> "+First);
		
	
		//Check Collection Empty status
		boolean flag1=mobile.isEmpty();
		System.out.println("Is Collection is Empty ? "+flag1);
		
		
		//Read All Collection object using foreach loop
		for (String EachMobile : mobile) 
		{
			System.out.println("=>"+EachMobile);
		}
		
		//Read Objects From Collection Using while loop
		Iterator<String> itr=mobile.iterator();
		while(itr.hasNext())
		{
			String Each=itr.next();
			System.out.println(Each);
		}
		
		
	}

}
