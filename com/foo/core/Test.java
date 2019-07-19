package com.foo.core;

public class Test {
    public static void main(String[] args) {
        com.foo.core.Stack<String> stringStack = new com.foo.core.Stack<String>();
        stringStack.push("foo");
        stringStack.push("duo");

        System.out.println(stringStack.pop());
        System.out.println(stringStack.peek());

        stringStack.push("yan");

    }
}
