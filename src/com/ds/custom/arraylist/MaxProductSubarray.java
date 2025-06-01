package com.ds.custom.arraylist;

public class MaxProductSubarray {

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] { 2, 3, -2, 4 })); // Output: 6
		System.out.println(maxProduct(new int[] { -2, 0, -1 })); // Output: 0
		System.out.println(maxProduct(new int[] { -2, 3, -4 })); // Output: 24
		System.out.println(maxProduct(new int[] { -1, -3, -10, 0, 60 })); // Output: 60
	}
	public static int maxProduct(int[] nums) {
		if (nums.length == 0)
			return 0;

		int maxSoFar = nums[0];
		int minSoFar = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int curr = nums[i];
			if (curr < 0) {
				int temp = maxSoFar;
				maxSoFar = minSoFar;
				minSoFar = temp;
			}
			// Calculate max/min at this position
			maxSoFar = Math.max(curr, maxSoFar * curr);
			minSoFar = Math.min(curr, minSoFar * curr);

			result = Math.max(result, maxSoFar);
		}
		return result;
	}
}
