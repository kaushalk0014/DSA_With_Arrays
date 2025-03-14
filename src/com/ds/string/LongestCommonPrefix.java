package com.ds.string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String [] arr= {"flower","flow","flight"};
		String prefix=longestCommonPrefix(arr);
		System.out.println("Prefix : "+prefix);
	}
	
	public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        
        //here first array value storing in prefix
        String prefix = strs[0];
        
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
            	
            	//here every time removing one character and comparing in while loop
                prefix = prefix.substring(0, prefix.length() - 1);
                
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

 
