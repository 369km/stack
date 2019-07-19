package com.foo.core;

public class HashMap<K, V> {
    private final static int DEFUALT_INITIAL_CAPACITY = 1 << 4;
    private final static float DEFUALT_LOAD_FACTOR = 0.75f;
    private Entry<K, V>[] table;
    private final float loadFactor;
    private int size = 0;
    private int use = 0;

    public HashMap() {
        this(DEFUALT_INITIAL_CAPACITY);
    }

    public HashMap(int initCapacity) {
        this(initCapacity, DEFUALT_LOAD_FACTOR);
    }

    public HashMap(int initCapacity, float loadFactor) {
        this.table = new Entry[initCapacity];
        this.loadFactor = loadFactor;
    }

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
