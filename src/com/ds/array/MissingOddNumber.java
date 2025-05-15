package com.ds.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        
        
        String str="batter butter";
    	
    	
    	str=str.replace(" ", "").toLowerCase();
    	
    	Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    	.entrySet().stream().filter(map-> map.getValue()>1).forEach(entry->{
    		System.out.println("Key : "+entry.getKey() +"   , Value : "+ entry.getValue());
    	});
    		
    	List<String> strResult=Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    	.entrySet().stream().filter(map-> map.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
    	
    		//System.out.println("Key : "+k +"   , Value : "+ v);
    	
    	 
    }
}

