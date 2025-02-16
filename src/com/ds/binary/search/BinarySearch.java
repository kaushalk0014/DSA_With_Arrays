package com.ds.binary.search;

public class BinarySearch {

	public static void main(String[] args) {
		// In binary search data should we sorted order
		int arr[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18 };
		System.out.println("Is find target value : "+binarySearch(arr, 12));
	}

	private static boolean binarySearch(int[] arr, int target) {

		int low = 0;
		int high = arr.length-1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return true;
			}
			if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		} // end while
		return false;
	}
}
