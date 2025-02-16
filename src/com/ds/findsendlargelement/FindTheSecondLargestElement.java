package com.ds.findsendlargelement;

public class FindTheSecondLargestElement {

	public static void main(String[] args) {
		int arr[] = { 10, 15, 16, 12, 18 };
		
		System.out.println("Find the second largest element : "+ findTheSecondLargestElement(arr));
	}

	private static int findTheSecondLargestElement(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if(num>second && num!=first) {
				second=num;
			}
		}
		return second;
	}
}
