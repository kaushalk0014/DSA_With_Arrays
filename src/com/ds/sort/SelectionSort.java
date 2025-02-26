package com.ds.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 12, 64, 5, 4, 19, 16, 14, 5, 9, };

		int n = arr.length;

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int minValue = arr[minIndex];

			for (int k = minIndex; k > i; k--) {
				arr[k] = arr[k - 1];
			}
			arr[i] = minValue;
		} // end for loop

		System.out.println("Sorted Data : ");

		Arrays.stream(arr).forEach(num -> System.out.print(num + ", "));
	}
}
