package mq.java.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hast_Map {

	public static void main(String[] args) {
		
		
		//HashMap:-->
		//HashMap is non synchronized.
		//HashMap allows one null key and multiple null values.
		
		   Map<String, Double> map=new HashMap<String, Double>();
		   map.put("iphone",25000.00);
		   map.put("Samsung",23000.00);
		   map.put("Vivo",15000.00);
		   map.put("Blakberry",35000.00);
		   map.put("OnePlus",20000.00);
		   map.put(null,null);
		   map.put("MI",null);
		   
		   //Read Any Object value using keyname
		   double price=map.get("Vivo");
		   System.out.println("Keyname is --> "+price);
		   
		   //Get size of collection
		   int Count=map.size();
		   System.out.println("Collection Count is ---> "+Count);
		   
		  
		   //Read all object from Hashtable
		   for (String key : map.keySet()) 
		   {
			   Double Eachprice=map.get(key);
			   System.out.println(Eachprice);
		   }
	}

}
