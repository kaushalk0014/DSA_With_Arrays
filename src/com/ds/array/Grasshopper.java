package com.ds.array;

public class Grasshopper {

	public static void main(String[] args) {
		int[] jumps = { 2, -3, 4 };
		int jumpCount = jumps.length;

		int result = lowestStartingStair(jumpCount, jumps);
		System.out.println("Lowest starting stair: " + result);
	}

	public static int lowestStartingStair(int jumpCount, int[] jumps) {
		int minPosition = 0;
		int currentPosition = 0;

		for (int i = 0; i < jumpCount; i++) {
			currentPosition += jumps[i];
			minPosition = Math.min(minPosition, currentPosition);
		}

		return 1 - minPosition;
	}
}
