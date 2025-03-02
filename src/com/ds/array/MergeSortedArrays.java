package com.ds.array;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {1, 3};
        int[] arr2 = {2, 4, 6, 8};
		
		int m=arr1.length;
		int n=arr2.length;
		
		int i=0, j=0, k=0;
		//merge array
		
		int merged[]=new int[m+n];
		
		while(i < m && j < n) {
			if(arr1[i] < arr2[j]) {
				merged[k++]=arr1[i++];
			}else {
				merged[k++]=arr2[j++];
			}
		}
		
		//copy remaining array 1
		while(i<m) {
			merged[k++]=arr1[i++];
		}
		
		//copy remaining array 2
		while(j < n) {
			merged[k++] = arr2[j++];
		}
		
		System.out.println("Merged Sorted Array : ");
		for(int num: merged) {
			System.out.print(num +", ");
		}
		
	}
}
