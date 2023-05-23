package mq.java.collections;

import java.util.Hashtable;
import java.util.Map;

public class Map_Interface 
{

	public static void main(String[] args) 
	{
		/*
		 * 			
		 *	HashTable:-->
		 *		HashMap is synchronized.
		 *		Hashtable doesn't allow any null key or value.						
		 */
		
		
		   Map<Integer, String> map=new Hashtable<Integer,String>();
		   map.put(100, "iphone");
		   map.put(101, "Samsung");
		   map.put(101, "Vivo");
		   map.put(103, "Blakberry");
		   map.put(104, "OnePlus");
		   map.put(105, "iphone");
		   
		   //Read Any Object value using keyname
		   String object=map.get(103);
		   System.out.println("Keyname is --> "+object);
		   
		   //Get size of collection
		   int Count=map.size();
		   System.out.println("Collection Count is ---> "+Count);
		   
		  
		   //Read all object from Hashtable
		   for (Integer key : map.keySet()) 
		   {
			   String eachkey=map.get(key);
			   System.out.println(eachkey);
		   }
		   
		   
		   
		   
		   

	}

}
