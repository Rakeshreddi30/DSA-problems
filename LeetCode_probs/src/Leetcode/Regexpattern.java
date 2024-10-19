package Leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regexpattern {

	public static void main(String[] args) {
	// syntax match for the Email adddress it will validate the email.
		String syntax = "^[A-Za-z0-9.-]+@[A-Za-z0-9.-]+$";
		String email = "rakeshgopidi19@gmail.com";
		
		Pattern pattern = Pattern.compile(syntax);
		Matcher matcher = pattern.matcher(email);
		try {
		//matches method find for the pattern is correct or not
			if(matcher.matches()) {
				System.out.println("Given string is valid");
				
		//find method in matcher class is only used to find the keyword present in syntax.
				if(matcher.find()) {
				System.out.println("Given characters in text matches the patter");
				}else {
					System.out.println("Given text char does not contais in syntax");
				}
			} else {
				System.out.println("Given string is invalid");
			}
		}catch(PatternSyntaxException e) {
			System.out.println("Given string is invalid");
		}
		

	}

}
