package com.ds.custom.hashmap;

import java.util.function.BiConsumer;

public class CustomHashMapTest {

	public static void main(String[] args) {
		CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("One", 1);
        map.put("Five", 5);
        map.put("Nine", 9);

        System.out.println("Value for 'Five': " + map.get("Five"));
        System.out.println("Contains 'Nine'?:  " + map.containsKey("Nine"));
        
        System.out.println("For Each loop");
        map.forEach((k,v)->{
        	System.out.println("Key : "+k +" Value : "+v);
        });
        
        System.out.println("-------------");
        BiConsumer<Object, Object> biCon=(k, v)->{
        	System.out.println(k+" "+ v);
        };
        
        biCon.accept(map, map);
	}
}
