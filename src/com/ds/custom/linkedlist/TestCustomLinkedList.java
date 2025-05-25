package com.ds.custom.linkedlist;

public class TestCustomLinkedList {

	public static void main(String[] args) {
		CustomLinkedList customLinkedList=new CustomLinkedList();
		customLinkedList.add(1);
		customLinkedList.add(2);
		customLinkedList.add(3);
		customLinkedList.add(4);
		customLinkedList.add(5);
		
		customLinkedList.print();
		
		System.out.println("Size : "+customLinkedList.size());
	}
}
