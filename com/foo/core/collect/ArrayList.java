package com.foo.core.collect;

public class ArrayList<E> extends AbstractArray<E> {
    private final static int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object[] array;

    public ArrayList() {
        this(INITIAL_CAPACITY);
    }

    public ArrayList(int initialCapcity) {
        if (initialCapcity <= 0) {
            throw new RuntimeException("initial capacity is error");
        }
        array = new Object[initialCapcity];
    }


    public void add(E item) {
        ensureCapacityHelper(size + 1, (E[]) array);
        array[size++] = item;
    }

    public E get(int index) {
        rangeCheck(index);
        return elementData(index);
    }

    public E set(int index, E item) {
        rangeCheck(index);
        E e = elementData(index);
        array[index] = item;
        return e;
    }

    public E remove(int index) {
        rangeCheck(index);
        E e = elementData(index);
        int move = size - index - 1;
        if (move > 0) {
            System.arraycopy(array, index + 1, array, index, move);
        }
        array[--size] = null;
        return e;
    }

    public boolean contains(E item) {
        return contains(item, size, (E[]) array);
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
    }

    private E elementData(int index) {
        return (E) array[index];
    }

    private void rangeCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("index out");
        }
    }
}
