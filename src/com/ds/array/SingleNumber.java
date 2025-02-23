package com.ds.array;

public class SingleNumber {

	public static void main(String[] args) {
		
		int arr[] = { 4, 1, 2, 3, 3, 1, 5, 2, 5 };
		
		int result=findSingleNumber(arr);
		System.out.println("Single Nubmer: "+ result);
		
	}
	
	private static int findSingleNumber(int arr[]){
		int result=0;
		
		for(int i =0; i<arr.length; i++) {
			result= result^arr[i];
		}
		
		return result;
	}
	
}
