package com.ds.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsingJava8Streams2 {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6,9 };

		List<Integer> reverseArr=Arrays.stream(arr)
		.sorted(Collections
		.reverseOrder())
		.collect(Collectors.toList());

		System.out.print("Reverse array : ");

		for(int i=0; i< reverseArr.size(); i++) {
			System.out.print(reverseArr.get(i)+ " ");
		}
		
	}
}
