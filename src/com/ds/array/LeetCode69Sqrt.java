package com.ds.array;

public class LeetCode69Sqrt {
	public static void main(String[] args) {
		System.out.println("Result : "+mySqrt(55));
	}

	public static int mySqrt(int x) {

		if (x == 0 || x == 1) {
			return x;
		}
		int result = 1;
		int low = 0;
		int high = x;

		while (low <= high) {
			int mid = (low + high) / 2;
			System.out.println("Mid : "+(x / mid));
			if (mid <= (x / mid)) {
				result = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return result;
	}
}
