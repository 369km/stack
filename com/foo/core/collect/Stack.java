package com.foo.core.collect;

public class Stack<E> extends AbstractArray<E> {
    private final static int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object[] array;

    public Stack() {
        this(INITIAL_CAPACITY);
    }

    public Stack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new RuntimeException("initial capacity is error");
        }
        array = new Object[initialCapacity];
    }

    public E push(E item) {
        ensureCapacityHelper(size + 1, (E[]) array);
        array[size++] = item;
        return item;
    }

    public E peek() {
        if (isEmpty(size)) {
            throw new IndexOutOfBoundsException("stack is empty");
        }
        return (E) array[size - 1];
    }

    public E pop() {
        E item = peek();
        array[size-1]=null;
        size--;
        return item;
    }

    public boolean isFull() {
        return size == array.length;
    }
    public int size(){
        return size;
    }
}
