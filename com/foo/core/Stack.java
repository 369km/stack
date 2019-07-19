package com.foo.core;

import java.util.Arrays;

public class Stack<E> {
    private int size = 0;
    private Object[] array;

    public Stack() {
        this(10);
    }

    public Stack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new RuntimeException("initial capacity is error");
        }
        array = new Object[initialCapacity];
    }

    public E push(E item) {
        ensureCapacityHelper(size + 1);
        array[size++] = item;
        return item;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("stock is empty");
        }
        return (E) array[size - 1];
    }

    public E pop() {
        E item = peek();
        size--;
        return item;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacityHelper(int minCapacity) {
        if (minCapacity > array.length) {
            grow();
        }
    }

    private void grow() {
        int oldCapacity = array.length;
        int newCapacity = oldCapacity * 2;
        if (newCapacity < oldCapacity) {
            throw new OutOfMemoryError();
        }
        array = Arrays.copyOf(array, newCapacity);
    }
}
