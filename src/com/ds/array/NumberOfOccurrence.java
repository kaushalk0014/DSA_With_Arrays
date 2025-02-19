package com.ds.array;

public class NumberOfOccurrence {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 2, 3, 4, 5};
		int target = 2;
		int first=countFreqFirst(arr, target);
		int last = countFreqLast(arr, target);
		
		int count= last-first+1;
		System.out.println("count = "+ count);
		
	}
	
	
	private static int countFreqFirst(int[] arr, int target) {
		
		int low=0; int high=arr.length-1;
		int first= -1;
		
		while(low<=high) {
			int mid=  (low+high)/2;
			if(arr[mid]==target) {
				first =mid;
				high=mid-1;
			} else if (arr[mid] > target ) {
				high= mid-1;
			}else {
				low =mid+1;
			}
		}
		
		return first;
	}
	
	private static int countFreqLast(int[] arr, int target) {
		int last =-1;;
		
		int low=0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid]== target) {
				last=mid;
				low= mid+1;
			}else if(arr[mid]>target) {
				high =mid-1;
			}else {
				low = mid +1;
			}
		}
		
		return last;
	}
}
