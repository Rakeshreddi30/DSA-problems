package Leetcode;

import java.util.Scanner;

public class Stringtoken {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
// trim method is used to avoid if spaces is given before or after the string
//remove spaces before spliting the string
		value = value.trim();
// check if the input is empty
		if(value.isEmpty()) {
			System.out.println(0);
		}else {
//here the string contains methods that split string all the other symbools except aplhabetic chracters
			String words[] = value.split("[^a-zA-Z]+");
			int len = words.length;
			System.out.println(len);
			for(String word : words) {
				if(!word.isEmpty()) {
					System.out.println(word);
				}
			}	
		}
        sc.close();
	}

}
