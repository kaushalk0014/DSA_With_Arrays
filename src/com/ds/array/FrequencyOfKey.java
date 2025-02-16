package com.ds.array;

public class FrequencyOfKey {
	public static void main(String[] args) {

		int[] arr = { 1, 5, 8, 6, 1, 9, 2, 1, 7, 5, 1, 6, 2, 4, 5 };
		
		System.out.println("Frequency of Key : "+ findFrequencyOfKey(arr, 1));
		System.out.println("Frequency of Key : "+ findFrequencyOfKey(arr, 5));
	}

	private static int findFrequencyOfKey(int[] arr, int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				count++;
			}
		}

		return count;
	}
}
