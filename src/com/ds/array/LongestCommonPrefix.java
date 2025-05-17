package com.ds.array;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		 String[] arr = { "geeksforgeeks", "geeks", 
         		"geek", "geezer" };
		 String result=findCommonPrefix(arr);
		 System.out.println("Result : "+result);
	}
	
	private static String findCommonPrefix(String arr[]) {
		
		Arrays.sort(arr);;
		//System.out.println(Arrays.toString(arr));
		/*
		 * Find first and last string/value in given array
		 */
		String first=arr[0];
		String last= arr[arr.length-1];// It will last index value
		
		int i=0;
		while(i<first.length() && first.charAt(i)==last.charAt(i)) {
			i++;
		}
		
		return first.substring(0, i);
	}
}
