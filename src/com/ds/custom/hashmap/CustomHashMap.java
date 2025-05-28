package com.ds.custom.hashmap;

import java.util.LinkedList;
import java.util.function.BiConsumer;

public class CustomHashMap<K, V> {

	private static final int INITIAL_CAPACITY = 16;
	private static final float LOAD_FACTOR = 0.75f;

	private LinkedList<Entry<K, V>>[] buckets;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public CustomHashMap() {
		buckets = new LinkedList[INITIAL_CAPACITY];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void put(K key, V value) {
		int bucketIndex = getIndex(key);

		if (buckets[bucketIndex] == null) {
			buckets[bucketIndex] = new LinkedList<>();
		}

		for (Entry<K, V> entry : buckets[bucketIndex]) {
			if (entry.key.equals(key)) {
				entry.value = value;
				return;
			}
		}
		buckets[bucketIndex].add(new Entry<K, V>(key, value));
		size++;

		if ((float) size / buckets.length > LOAD_FACTOR) {
			incerSize();
		}
	}

	@SuppressWarnings("unchecked")
	private void incerSize() {
		LinkedList<Entry<K, V>>[] oldBucket = buckets;
		buckets = new LinkedList[oldBucket.length * 2];
		size = 0;

		for (LinkedList<Entry<K, V>> bucket : oldBucket) {
			if (bucket != null) {
				for (Entry<K, V> entry : bucket) {
					put(entry.key, entry.value);
				}
			}
		}

	}

	public V get(K key) {
		int index = getIndex(key);

		if (buckets[index] == null)
			return null;

		for (Entry<K, V> entry : buckets[index]) {
			if (entry.key.equals(key)) {
				return entry.value;
			}
		}

		return null;
	}

	private int getIndex(K key) {
		return Math.abs(key.hashCode() % buckets.length);
	}

	public boolean containsKey(K key) {
		// return get(key)!=null;
		int index = getIndex(key);
		if (buckets[index] == null)
			return true;

		for (Entry<K, V> entry : buckets[index]) {
			if (entry.key.equals(key)) {
				return true;
			}
		}
		return false;
	}

	public void forEach(BiConsumer<? super K, ? super V> action) {
		for (LinkedList<Entry<K, V>> bucket : buckets) {
			if (bucket != null) {
				for (Entry<K, V> entry : bucket) {
					action.accept(entry.key, entry.value);
				}
			}
		}
	}

	private static class Entry<K, V> {
		final K key;
		V value;

		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
}
