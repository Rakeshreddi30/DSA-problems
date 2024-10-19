package Leetcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIPaddress {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		while(sc.hasNext()) {
			String IP = sc.next();
			boolean Isvalid = ValidIpaddress(IP);
			System.out.println(Isvalid);
		}
	}
	public static boolean ValidIpaddress(String s){
		String pattern = "^([01]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\." +
				         "([01]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\." +
				         "([01]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\." +
				         "([01]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])$";
	                     
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
}
