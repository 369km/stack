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

    public void put(K key, V value) {
        int index = hash(key);
        Entry<K, V> entry = table[index];
        if (entry == null) {
            table[index] = new Entry<>(key, value, null);
            size++;
            use++;
            if (use >= table.length * loadFactor) {
                resize();
            }
        } else {
            for (; entry != null; entry = entry.next) {
                if (entry.key == key || entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
            }
            Entry<K, V> newEntry = new Entry<>(key, value, table[index]);
            table[index] = newEntry;
            size++;
        }
    }

    private void resize() {
        int newLength = table.length * 2;
        Entry<K, V>[] oldTable = this.table;
        table = new Entry[newLength];
        use = 0;
        for (int i = 0; i < oldTable.length; i++) {
            Entry<K, V> e = oldTable[i];
            while (null != e) {
                int index = hash(e.key);
                if (null == table[index]) {
                    use++;
                    table[index] = new Entry<>(e.key, e.value, null);
                } else {
                    Entry<K, V> newEntry = new Entry<>(e.key, e.value, table[index]);
                    table[index] = newEntry;
                }
                e = e.next;
            }
        }
    }

    public void remove(K key) {
        int index = hash(key);
        Entry<K, V> entry = table[index];
        Entry<K, V> pre = null;
        for (; entry != null; pre = entry, entry = entry.next) {
            if (entry.key == key || entry.key.equals(key)) {
                if (pre == null) {
                    table[index] = null;
                } else {
                    pre.next = entry.next;
                    size--;
                }
                return;
            }
        }

    }

    public V get(K key) {
        int index = hash(key);
        Entry<K, V> entry = table[index];
        for (; entry != null; entry = entry.next) {
            if (entry.key == key || entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
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
