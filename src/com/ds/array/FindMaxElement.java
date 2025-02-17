package com.ds.array;

import java.util.Arrays;

public class FindMaxElement {

	public static void main(String[] args) {

		int arr[] = { 1, 8, 7, 56, 90 };
		int maxValue = largest(arr, arr.length);
		System.out.println("Max Value is : " + maxValue);
		
		System.out.println("Max Value is 2: " + largest2(arr, arr.length));

		System.out.println("Find max value using java 8");
		
		System.out.println("Max Value is : " + largestUsingJava8(arr));
		
		System.out.println("Max Value is 2 : " + largestUsingJava82(arr));
		
		System.out.println("Max Value is 3 : " + largestUsingJava83(arr));
		
		System.out.println("Max Value is 4 : " + largestUsingJava84(arr));
	}

	private static int largest(int arr[], int n) {
		int max = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	private static int largest2(int arr[], int n) {
		int max = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max=Math.max(max, arr[i]);
			}
		}
		return max;
	}
	
	
	private static int largestUsingJava8(int arr[]) {
		return Arrays.stream(arr).max().getAsInt();
	}
	
	private static int largestUsingJava82(int arr[]) {
		return Arrays.stream(arr).max().orElseThrow();
	}
	
	private static int largestUsingJava83(int arr[]) {
		return Arrays.stream(arr).reduce((a,b)-> a>b?a:b).getAsInt();
	}
	
	private static int largestUsingJava84(int arr[]) {
		return Arrays.stream(arr).reduce(Integer.MIN_VALUE,  (a,b)-> a>b?a:b);
		
	}
}
