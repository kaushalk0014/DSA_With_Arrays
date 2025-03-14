package com.ds.array;

public class LeetCode367ValidPerfectSquare {

	public static void main(String[] args) {
		System.out.println("Valid Perfect Square 1 : "+ isValidPerfectSquare(15));
		System.out.println("Valid Perfect Square 2 : "+ isValidPerfectSquare(16));
		System.out.println("Valid Perfect Square 3 : "+ isValidPerfectSquare(20));
		System.out.println("Valid Perfect Square 4 : "+ isValidPerfectSquare(25));
	}
	
	private static boolean isValidPerfectSquare(int num) {
		
		int ans= 0;
		int low =0;
		int high = num;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(mid <= num/mid) {
				ans= mid;
				low = mid+1;
			}else {
				high = mid -1;
			}
		}
		if((ans* ans) ==num) {
			return true;
		}
		return false;
	}
}

