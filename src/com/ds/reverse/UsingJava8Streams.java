package com.ds.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsingJava8Streams {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		//if we are using int as array then we need to used boxed() method
		
		List<Integer> reverseArr=Arrays.stream(arr)
				.boxed()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		System.out.print("Reverse array :");
		for (Integer num : reverseArr) {
			System.out.print(num +" ");
		}

	}
}
