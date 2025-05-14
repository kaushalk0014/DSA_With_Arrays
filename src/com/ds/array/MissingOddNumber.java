package com.ds.array;

import java.util.Arrays;

public class MissingOddNumber {
    public static void main(String[] args) {
        int[] intArr = {9, 1, 3, 7};
        Arrays.sort(intArr);  // Sort to get the numbers in order
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] - intArr[i - 1] != 2) {
                int missing = intArr[i - 1] + 2;
                System.out.println("Missing number is: " + missing);
                return;
            }
        }
        System.out.println("No missing number.");
    }
}

