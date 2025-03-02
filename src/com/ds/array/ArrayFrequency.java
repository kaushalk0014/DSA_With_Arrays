package com.ds.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayFrequency {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 4, 1, 5, 2, 4, 1, 6, 2, 5, 1, 8, 2 };

		// approach 1
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : arr) {

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		System.out.println(map);

		// approach 2
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		for (int num : arr) {
			map2.put(num, map2.get(num) == null ? 1 : map2.get(num) + 1);
		}
		System.out.println(map2);

		// approach 3
		Map<Integer, Integer> map3 = new HashMap<Integer, Integer>();
		for (int num : arr) {
			map3.put(num, map3.getOrDefault(num, 0) + 1);
		}
		System.out.println(map3);

		// approach 4 using java 8
		
		Map<Integer, Long> frequencyOfArray=Arrays.stream(arr)
		.boxed().collect(Collectors.groupingBy(num-> num, Collectors.counting()));
		
		System.out.println(frequencyOfArray);
		
		
		//Given an array arr of positive integers and an integer x. Return the frequency of x in the array.
		
		int intArr[]= {1, 2, 3, 3, 2, 2, 1}; 
		int target =2;
		
		int frequency=Collections.frequency( Arrays.stream(intArr).boxed().toList(), target);
		
		System.out.println("Frequency: " +frequency);
	}
}
