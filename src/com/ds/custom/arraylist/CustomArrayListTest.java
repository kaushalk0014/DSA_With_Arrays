package com.ds.custom.arraylist;

public class CustomArrayListTest {

	public static void main(String[] args) {
		CustomArrayList<Integer> list=new CustomArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.forEach(data-> {
			System.out.println(data);
		});
		
		System.out.println(list.toString());
	}
}
