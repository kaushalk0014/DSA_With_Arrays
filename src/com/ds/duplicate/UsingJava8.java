package com.ds.duplicate;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class UsingJava8 {

	// Time Complexity: O(N) | Space Complexity: O(N)

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 4, 8, 6, 3, 9, 2, 5, 2, 1, 5, 3 };

		System.out.println("Frequency of given value :" + findFrequencyOfArray(arr));

	}

	private static Map<Integer, Long> findFrequencyOfArray(int[] arr) {
		Map<Integer, Long> map = Arrays.stream(arr).boxed()// Convert in to Integer
				.collect(Collectors.groupingBy(num -> num, Collectors.counting()));

		return map;
	}
}
