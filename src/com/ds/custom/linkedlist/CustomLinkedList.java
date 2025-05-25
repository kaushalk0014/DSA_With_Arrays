package com.ds.custom.linkedlist;

public class CustomLinkedList {

	Node head;

	public CustomLinkedList() {
	}

	public CustomLinkedList(int[] arr) {
		addAll(arr);
	}

	public boolean add(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			return true;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
		return true;
	}

	public boolean addAll(int[] arr) {
		if (arr == null || arr.length < 1)
			return false;

		for (int num : arr) {
			add(num);
		}
		return true;
	}

	public boolean delete(int value) {
		if (head == null) {
			return false;
		}
		if (head.data == value) {
			head = head.next;
			return true;
		}
		Node current = head;
		while (current.next != null && current.next.data != value) {
			current = current.next;
		}
		if (current.next == null) {
			return false;
		}

		current.next = current.next.next;
		return true;
	}

	public boolean isContains(int value) {

		Node current = head;
		while (current != null) {
			if (current.data == value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public int size() {
		int size = 0;
		Node current=head;
		while(current!=null) {
			size++;
			current=current.next;
		}
		return size;
	}

	public void print() {

		Node current = head;
		while (current != null) {
			System.out.println(current.data + " -> ");
			current = current.next;
		}
		// System.out.println("null");
	}
}
