package mq.java.String;


public class String_Comparision {

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 			=> String store set of characters
		 * 			=> String is a non primitive datatype.
		 * 			=> String is not only a datatype and also
		 * 				called as Class, String class contins
		 * 				set of methods to validate stored characters..
		 */
		
		
		String ActRes="Account Created";
		String ExpRes="Account created";
		
		/*
		 * Equals:-->
		 * 			Method verify equal comparision between
		 * 			two strings and return boolean value.
		 * 
		 * 		Note:--> Comparision is casesensitive
		 */
		boolean flag=ActRes.equals(ExpRes);
		System.out.println("Equal comparision is --->"+flag);
		
		
		/*
		 * EqualIgnorecase:-->
		 * 			Method verify equal comparision by
		 * 			ignoring casesensitive
		 */
		boolean flag1=ActRes.equalsIgnoreCase(ExpRes);
		System.out.println("Equal ignorecase comparision is --> "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Method verify subsequent characters available
		 * 		with in main string and return boolean value.
		 */
		String status="Account 100 Created";
		System.out.println("TureCondition--> "+status.contains("Account"));
		System.out.println("FalseCondition--> "+status.contains("Account Created"));
		
		
		/*
		 * length:-->
		 * 		Method return number of characters count
		 * 		with in string 
		 */
		String MobileNumber="9030248855";
		int Length=MobileNumber.length();
		if(Length==10)
			System.out.println("Valid MobileNumber");
		else
			System.out.println("Invalid MobileNumber");
		
		
		
		/*
		 * Trim:-->
		 * 		Method trim extra characters available
		 * 		at string. Only trim left and right chacters
		 */
		String Pincode="   500075     ";
		System.out.println("Before Trim length is --> "+Pincode.length());
		if(Pincode.length() == 6)
			System.out.println("Valid PinCode");
		else
			System.out.println("Invalid Pincode");
		
		//Trimmnig extra space characters 
		String NewPincode=Pincode.trim();
		System.out.println("After Trim pincode length is --> "+NewPincode.length());
		if(NewPincode.length() == 6)
			System.out.println("Valid PinCode");
		else
			System.out.println("Invalid Pincode");
		
		
		/*
		 * SubString:-->
		 * 		Method Get SubString characters from main String
		 */
		String AccountNum="123455889874";
		String LastDigits=AccountNum.substring(6);
		System.out.println("last Digits are --> "+LastDigits);
		
		String MiddleDigts=AccountNum.substring(4, 8);
		System.out.println("Middle Digits are --> "+MiddleDigts);
		
		String ProductPrice="$50000";
		System.out.println(ProductPrice.substring(1));
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify string empty status and return
		 * 		boolean value true/false
		 */
		String var1="";
		String var2="Hi";
		System.out.println("var1 empty status is ---> "+var1.isEmpty());
		System.out.println("Var2 empty status is ---> "+var2.isEmpty());
		if(!var2.isEmpty())
			System.out.println("Chars available");
		else
			System.out.println("Chars not available");
		
		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		String AccountNumber="111122227777";
		boolean flag5=AccountNumber.startsWith("1111");
		System.out.println("Starts with Comparision is --> "+flag5);
		
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=AccountNumber.endsWith("7777");
		System.out.println("ends with Comparision is --> "+flag6);
		
		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(0);
		System.out.println("charcters available at Zero index number ---> "+ch);
		
		
		/*
		 * ToLowerCase:-->
		 * 		method convert all Uppercase characters
		 * 		into lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		
		/*
		 * toUppercase:-->
		 * 		method convert all lowercase characters 
		 * 		into uppercase
		 */
		System.out.println(toolname.toUpperCase());
		
		
		/*
		 * concat:-->
		 * 			Method club two string 
		 */
		String firstname="SunilReddy";
		String surname="gajjala";
		System.out.println(firstname.concat(surname));
		System.out.println(firstname+surname);
		
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Price="$10,000";
		String NewPrice=Price.replace("$", "").replace(",","");
		System.out.println(NewPrice);
		
		//Print only numeric characters with in String using Regular expression
		String str="sdfvsdf68fsdfsf8999fsdf09";
		String numberOnly= str.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);
		
		//Example 
		String Info="Account 100 created";
		String ID= Info.replaceAll("[^0-9]", "");
		System.out.println(ID);
		
		
	}

}
