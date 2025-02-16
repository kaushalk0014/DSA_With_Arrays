package com.ds.array;

import java.util.HashSet;
import java.util.Set;

public class SubSetUsingSet {
	public static void main(String[] args) {
		int arr[] = { 10, 12, 15, 16, 12, 12, 18, 19 };
		int subArr[] = { 10, 12, 15, 12, 12 };

		System.out.println("Is present sub array: " + findSubset(arr, subArr));
	}

	private static boolean findSubset(int[] arr, int[] subArr) {
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		for (int num : subArr) {
			if (!set.contains(num)) {
				return false;
			}
		}
		return true;
	}
}
