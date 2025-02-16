package com.ds.reverse;

public class ReverseArray {

	public static void main(String[] args) {
		// int arr[]=new int[5];
		int arr[] = { 1, 2, 3, 4, 5 };
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++; 
			high--;
		}// end loop
		
		System.out.print("Reverse array : ");
		for(int num : arr) {
			 System.out.print(num + " ");
		}
	}
}
