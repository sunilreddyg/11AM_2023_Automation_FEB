package exceptions_java;

public class Final_Try_Catch {

	public static void main(String[] args) {
		
		try {
		      int[] myNumbers = {1, 2, 3};   //Arrays
		      System.out.println(myNumbers[1]); 
		      
		   } catch (Exception e) {
		           System.out.println("Something went wrong.");
		           
		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }

	}

}
