package Leetcode;

public class Anagrams {

	public static void main(String[] args) {
   //Anagrams is nothing but forming different names with letter consists in that string
       String s1 = "Hello";
       String s2 = "lolhl";
       boolean value = isAnagram(s1, s2);
       System.out.println("Is the given string are Anagram : "+ value);
	}
	public static boolean isAnagram(String name1, String name2) {
		if(name1.length() == name2.length()) {
			String new1 = name1.toLowerCase();
			String new2 = name2.toLowerCase();
			
			int[] val = new int[26];
			
			for(int i=0; i<new1.length(); i++) {
				val[new1.charAt(i)- 'a']++;
			}
			for(int j =0; j<new2.length(); j++) {
				val[new2.charAt(j) - 'a']--;
				if(val[new2.charAt(j) - 'a'] < 0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}

}
