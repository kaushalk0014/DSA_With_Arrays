package com.ds.sort;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		int[] nums= { 12, 1, 45, 18, 19, 16, 14, 5, 9, 11};
		sortArray(nums);
		System.out.println("Sort Value");
		System.out.println(Arrays.toString(nums));
	}
	
	private static int[] sortArray(int[] nums) {
		for(int i=0; i< nums.length-1; i++) {
			for(int j=i+1; j< nums.length; j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i] = nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums;
	}
}
