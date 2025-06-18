package com.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenList {

	public static void main(String[] args) {
		List<Object> input = Arrays.asList(1, 2, Arrays.asList(3), Arrays.asList(4, 5),
				Arrays.asList(Arrays.asList(6)));
		List<Integer> result = new ArrayList<Integer>();

		FlattenList.flatten(input, result);
		
		System.out.println(result);
		
	}

	public static void flatten(List<?> list, List<Integer> result) {

		for (Object element : list) {
			if (element instanceof Integer) {
				result.add((Integer) element);
			} else if (element instanceof List<?>) {
				flatten((List<?>) element, result);
			}
		}
	}

}
