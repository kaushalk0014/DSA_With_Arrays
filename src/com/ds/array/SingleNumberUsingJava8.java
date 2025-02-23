package com.ds.array;

import java.util.Arrays;

public class SingleNumberUsingJava8 {
	
	public static void main(String[] args) {

		int arr[] = { 6, 1, 2, 3, 3, 1, 5, 2, 5 };

		int result = findSingleNumber(arr);
		System.out.println("Single Nubmer: " + result);

	}

	private static int findSingleNumber(int[] arr) {
		int result =Arrays.stream(arr).reduce(0, (a, b) -> a^ b);
		return result;
	}
}
