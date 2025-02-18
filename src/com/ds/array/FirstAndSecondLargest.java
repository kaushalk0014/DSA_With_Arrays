package com.ds.array;

import java.util.Arrays;
import java.util.Collections;

//https://www.geeksforgeeks.org/problems/second-largest3735/1

public class FirstAndSecondLargest {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 2, 5, 7, 8, 8 }; // Example input
		System.out.println(Arrays.toString(findFirstAndSecondLargest(arr))); // Output: [8, 7]
	}

	private static int[] findFirstAndSecondLargest(int[] arr) {

		int[] result = Arrays.stream(arr)
				.distinct()
				.boxed()
				.sorted(Collections.reverseOrder())
				.limit(2)
				.mapToInt(Integer::intValue)
				.toArray();

		return result.length > 2 ? new int[] { -1, -1 } : result;
	}
}
