package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class SubsetsGenerator {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
		 
		 backtrack(arr, 0, new ArrayList<Integer>(), result );
		 System.out.println("Result : "+ result);
	}

	private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
		result.add(new ArrayList<Integer>(current));
	 
		for(int i= start; i< nums.length; i++) {
			current.add(nums[i]);
			backtrack(nums, i+1, current, result);
			int size=current.size()-1;
			//System.out.println(size);
			current.remove(size);
			//System.out.println(current);
		}
	}
}
