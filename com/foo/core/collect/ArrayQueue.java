package com.foo.core.collect;

public class ArrayQueue {
    private final Object[] items;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new Object[capacity+1];
    }

    public boolean put(Object item) {
        if (isFull()) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % items.length;
        return true;
    }

    public Object peek() {
        if (head == tail) {
            return null;
        }
        return items[head];
    }

    public Object poll() {
        Object item = peek();
        items[head] = null;
        head = (head + 1) % items.length;
        return item;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return head == (tail + 1) % items.length;

    }

    public int size() {
        if (head <= tail) {
            return tail - head;
        } else {
            return tail + items.length - head;
        }
    }
}
