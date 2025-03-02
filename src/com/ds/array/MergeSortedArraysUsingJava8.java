package com.ds.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArraysUsingJava8 {

	public static void main(String[] args) {
		int[] arr1 = {1, 3};
        int[] arr2 = {2, 4, 6, 8};
		
		int m=arr1.length;
		int n=arr2.length;
		
		int mergedArr[]=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		
		for(int num: mergedArr) {
			System.out.print(num+ ", ");
		}
	}
}
