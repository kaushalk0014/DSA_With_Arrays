package com.ds.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollections {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		System.out.println("Collections.reverse() only works for Lists, not primitive arrays \n");
		Collections.reverse(Arrays.asList(arr));
		System.out.print("Reverse array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\n");
		//==========================================================
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		Collections.reverse(list);
		
		System.out.print("Reverse List : ");
		System.out.println(list);
		
	}
}
