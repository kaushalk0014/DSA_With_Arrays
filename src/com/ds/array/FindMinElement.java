package com.ds.array;

public class FindMinElement {

	public static void main(String[] args) {

		int arr[] = { 3, 2, 2, 56, 10000, 167 };
		System.out.println("Minmum value is : " + findMinElement(arr, arr.length));
	}

	private static int findMinElement(int arr[], int n) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (min > arr[i]) {
				//min=arr[i];
				min=Math.min(arr[i], min);
			}
		}
		return min;
	}
}
