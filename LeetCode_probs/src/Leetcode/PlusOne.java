package Leetcode;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
        int[] digits = {};
        int[] value = plusone(digits);
        System.out.println(Arrays.toString(value));
    }
	public static int[] plusone(int[] digits) {
		int n = digits.length;
		for(int i = n-1; i>=0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[n+1];
		result[0] = 1;
		return result;
	}
}
