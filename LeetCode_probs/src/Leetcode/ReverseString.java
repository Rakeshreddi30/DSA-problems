package Leetcode;

public class ReverseString {
	
   public static void main(String[] args) {
	   String name = "pooja";
	   StringBuilder reversed = reverseofstring(name);
	   
	  System.out.println("the given reversed string : " + reversed);
	  
   }
	public static StringBuilder reverseofstring(String value) {
		
		StringBuilder str = new StringBuilder(value);
		
		return str.reverse();
		
	}
	

}
