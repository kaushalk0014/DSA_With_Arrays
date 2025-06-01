package com.ds.custom.arraylist;

public class MaxProductOfThree {

	public static void main(String[] args) {
		System.out.println(maximumProduct(new int[] { 1, 2, 3 })); // Output: 6
		System.out.println(maximumProduct(new int[] { 1, 2, 3, 4 })); // Output: 24
		System.out.println(maximumProduct(new int[] { -1, -2, -3 })); // Output: -6
		System.out.println(maximumProduct(new int[] { -10, -30, -20, 4, 2, 10, 2, 5, 8, 9 })); // Output: 6000
	}

	public static int maximumProduct(int[] nums) {
		sortArray(nums);
		 int maxProduct1=nums[0]*nums[1]*nums[2];
		 int maxProduct2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
		 
		return Math.max(maxProduct1, maxProduct2);
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
