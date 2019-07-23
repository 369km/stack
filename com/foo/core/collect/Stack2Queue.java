package com.foo.core.collect;

public class Stack2Queue<E> {
    private Stack<E> first;
    private Stack<E> second;
    private int maxLength;

    public Stack2Queue(int capacity) {
        maxLength = capacity;
        first = new Stack<>(capacity);
        second = new Stack<>(capacity);
    }

    public boolean put(E item) {
        if (first.isFull() || maxLength == size()) {
            return false;
        }
        first.push(item);
        return true;
    }

    public E pop() {
        if (!second.isEmpty(second.size())) {
            return second.pop();
        } else {
            while (!first.isEmpty(first.size())) {
                second.push(first.pop());
            }
            return second.pop();
        }
    }

    public int size() {
        return first.size() + second.size();
    }
}
