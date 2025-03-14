package com.ds.array;

public class FindMinimumRotatedSortedArray {

	public static void main(String[] args) {
		int result=findMin(new int[] {7,8,9,10,11,2,3,5,6});
		System.out.println("Result : "+ result);
	}

	public static int findMin(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] > nums[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return nums[low];
	}
}
