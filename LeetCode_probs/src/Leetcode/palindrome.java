package Leetcode;

public class palindrome {

	public static void main(String[] args) {
		String name = "madama";
		Boolean val = ispalindrome(name);
		
		System.out.println(" Is the given name is palidrome? : "+ val);

	}
	public static boolean ispalindrome(String name) {
		StringBuilder str = new StringBuilder(name);
		if(str.reverse().toString() .equals(name)) {
			return true;
		}else {
			return false;
		}
	}

}
