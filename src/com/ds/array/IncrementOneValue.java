package com.ds.array;

import java.util.Arrays;

public class IncrementOneValue {

	public static void main(String[] args) {
		int arr[] = { 9,5,9 };
		// output: {1,0,0};

		System.out.println(Arrays.toString(onePlus(arr)));
	}

	public static int[] onePlus(int digits[]) {

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int result[] = new int[5];
		result[0] = 1;
		return result;
	}
}
