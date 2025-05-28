package com.ds.custom.arraylist;

import java.util.function.Consumer;

public class CustomArrayList<T> {

	private Object arr[] = null;
	private int size = 0;
	private static final int INITIAL_CAPACITY = 16;

	public CustomArrayList() {
		arr = new Object[INITIAL_CAPACITY];
	}

	public void add(T value) {
		ensureCapacity();
		arr[size++] = value;
	}

	private void ensureCapacity() {
		if (size == arr.length) {
			int newCapacity = arr.length * 2;
			Object[] newArray = new Object[newCapacity];
			for (int i = 0; i < arr.length; i++) {
				newArray[i] = arr[i];
			}
			arr = newArray;
		}
	}

	public int contains(T value) {
		
		if(value==null) {
			for(int i=0; i<size; i++) {
				if(arr[i]==null) {
					return i;
				}
			}
		}else {
			for(int i=0; i< size; i++) {
				if(value.equals(arr[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	public T remove(int index) {
		checkIndex(index);
		@SuppressWarnings("unchecked")
		T removeItem = (T) arr[index];
		for (int i = index; i < size - 1; i++) {
			if (i == index) {
				arr[i] = arr[i + 1];
			}
		}
		return removeItem;
	}

	public void addAll(T[] items) {
		for(T item: items) {
			add(item);
		}
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		checkIndex(index);
		return (T) arr[index];

	}

	private void checkIndex(int index) {
		if (size < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index " + index + ", Size " + size);
		}
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;
	}
	
	public void forEach(Consumer<? super T> action) {
		for(int i =0; i<size; i++) {
			@SuppressWarnings("unchecked")
			T data=(T) arr[i];
			action.accept(data);
		}
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder=new StringBuilder("[");
		for(int i=0; i<size; i++) {
			builder.append(arr[i]);
			if(i<size-1)
				builder.append(",");
		}
		builder.append("]");
		return builder.toString();
	}
}
