package com.ds.array;

import java.util.HashMap;
import java.util.Map;

public class SubSetOfArray {

	//O(N + M) → where N = arr.length and M = subArr.length (efficient solution).
	public static void main(String[] args) {
		int arr[] = { 10, 12, 15, 16, 12, 12, 18, 19 };
		
		int subArr[] = { 10, 12, 15, 12, 12,18 };
		System.out.println("Is present sub array : "+findSubsetOfArray(arr, subArr));
	}

	private static boolean findSubsetOfArray(int[] arr, int[] subArr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (int i = 0; i < subArr.length; i++) {
//			if (map.get(subArr[i]) > 0) {
//				map.put(subArr[i], map.get(subArr[i]) - 1);
//			}else {
//				return false;
//			}
			
			if(!map.containsKey(subArr[i]) && map.get(subArr[i])==0) {
				return false;
			}else {
				map.put(subArr[i], map.get(subArr[i])-1);
			}
		}
		return true;
	}
}
