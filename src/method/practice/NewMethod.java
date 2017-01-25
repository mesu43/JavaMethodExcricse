package method.practice;

import java.util.ArrayList;

public class NewMethod {
	
	public static void main(String[] args) {
		System.out.println("Ans#6." + getInLowerCase("This Is A Bangladesh"));
		System.out.println("Ans#5." + getInUpperCase("this Is a String"));
		System.out.println("Ans#4." + getAsKilometer(10));
		System.out.println("Ans#3." + getAllOddNumber(12));
		System.out.println("Ans#2." + getAllEvenNumber(10));
		System.out.println("Ans#1." + getName("this is String"));
		
	}
	/**Q.1.
	 * write a method that take  your name input and return your name.
	 * parameter/input:String name.
	 * returnType/output:String.
	 * servingBucket/container:variable.
	 */
		 public static String getName(String name){
		 String yourName = "";
		 yourName = name;
		 return yourName;
	 }
     /**Q.2
	  * write a method that take a number input and return the list of all even
	  * number from 0 to that given number.
	  * parameter/input:int number
	  * returnType/output:ArrayList<Integer>
	  * servingBucket/container:List
	  */
	public static ArrayList<Integer> getAllEvenNumber(int number) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				numberList.add(i);
			}
		}
		return numberList;
	}
	 /**Q.3
	  * write a method that take a number input and return the list of
	  * all odd number from 0 to that given number.
	  * 
	  * parameter/input:int number
	  * returnType/output:ArrayList<Integer>
	  * servingBucket/container:List
	  */
	 public static ArrayList<Integer> getAllOddNumber(int number){
		 ArrayList<Integer> numberList = new ArrayList<Integer>();
		 for (int i = 0; i<= number; i++){
			 if (i % 2 ==1){
				 numberList.add(i);
			  }
		   } 
		  return numberList;
		  
	  }
	   /**Q.4
	    * write a method that take input as mile & return as kilometer
	    * 
	    * parameter:double mile.
	    * returnType:double.
	    * servingBucket:variable
	    */
	  public static double getAsKilometer(double mile){
		  double kilometer =0;
		  kilometer = mile * 1.6;
		  return kilometer;
	  }
	   /**
	    * write a method that take one String input and return same String in upper case.
	    * 
	    * parameter:String text.
	    * returnType:String.
	    * servingBucket:variable.
	    */
	   public static String getInUpperCase(String text) {
		   String upperCase = "";
		   upperCase = text.toUpperCase();
		   return upperCase;
	   }
	    /**Q.6
	     * write a method that take one string input and return same String in lower case.
	     * 
	     * parameter:String text
	     * returnType:String
	     * servingBucket:variable
	     */
	    public static String getInLowerCase(String text) {
	    	String lowercase = "";
	    	lowercase = text.toLowerCase();
	    	return lowercase;
	    }
	  
	   
    }
