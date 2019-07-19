package com.foo.core;

import java.util.Arrays;

public class AbstractArray<E> {
    protected void ensureCapacityHelper(int minCapacity, E[] array) {
        if (minCapacity > array.length) {
            grow(array);
        }
    }

    protected boolean isEmpty(int size) {
        return size == 0;
    }

    protected boolean contains(E item, int size, E[] array) {
        return indexof(item, size, array) >= 0;
    }

    private int indexof(E item, int size, E[] array) {
        if (item == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (item.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    private void grow(E[] array) {
        int oldCapacity = array.length;
        int newCapacity = oldCapacity * 2;
        if (newCapacity < oldCapacity) {
            throw new OutOfMemoryError();
        }
        array = Arrays.copyOf(array, newCapacity);
    }
}
