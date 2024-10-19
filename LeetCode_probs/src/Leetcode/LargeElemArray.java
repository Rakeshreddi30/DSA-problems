package Leetcode;

import java.util.Arrays;

public class LargeElemArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,33,3,4,19,24,3,8};
		int big = findlargest(arr);
		System.out.println("The largest number in the given array was : "+ big);
	}
	
   //  First approach
//	public static int findlargest(int[] val) {
//		Arrays.sort(val);
//		int largestnum = val.length-1;
//		
//		return val[largestnum];
//	}
	
	//Second approach
   public static int findlargest(int[] val) {
	   int max = val[0];
	   for(int i=1; i<val.length; i++) {
		   if(val[i] > max) {
			   max = val[i];
		   }
	   }
	   return max;
   }
}
