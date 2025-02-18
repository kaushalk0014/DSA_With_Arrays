package com.ds.array;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1

public class FirstAndSecondSmallests {
	public static void main(String[] args) {
		int[] arr = {3, 1, 4, 1, 2, 5, 2};
        System.out.println(Arrays.toString(minAnd2ndMin(arr))); // Output: [1, 2]
	}
	
	private static int[] minAnd2ndMin(int arr[]) {
		
		int[] result =  Arrays.stream(arr)
		.distinct()
		.sorted()
		.limit(2)
		.toArray();
		
		
		return result.length <2? new int[] {-1, -1} : result;
	}
}
