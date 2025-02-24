package com.ds.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 12, 1, 45, 18, 19, 16, 14, 5, 9, };
		int n = arr.length;
		System.out.println("Original Array : ");
		Arrays.stream(arr).forEach(num-> System.out.print(num+", "));
		for (int i = 0; i < n-1; i++) {
			
			for(int j =0; j< n-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] =temp;
				}
			}// end for loop
		}// end for loop
		System.out.println("\nSorted Array : ");
		Arrays.stream(arr).forEach(num-> System.out.print(num+", "));
	}
}
