package method.practice;

public class NewMethod {
	
	public static void main(String[] args) {
		
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
}
