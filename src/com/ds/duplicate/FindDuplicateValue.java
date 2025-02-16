package com.ds.duplicate;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateValue {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 2, 6, 5, 9, 8 };
		findDuplicate(arr);
	
	}
	
	private static void findDuplicate(int[] arr) {
		
		//approach 1
//		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
//		
//		for(int num: arr) {
//			map.put(num, map.getOrDefault(num, 0)+1);
//		}
//		System.out.println(map); System.out.println("\n");
		
		//approach 2
		int[] arr2 = { 1, 2, 2, 5, 4, 2, 1, 6, 5 };
		Map<Integer, Integer> map2=new HashMap();
		for(int num: arr2) {
			if(map2.containsKey(num)) {
				map2.put(num, map2.get(num)+1);
			}else {
				map2.put(num, 1);
			}
		}
		
		System.out.println("Approach 2 : "+map2);
		
		
		
		
		 
	}
}
