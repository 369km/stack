package com.foo.core;

public class Test {
    public static void main(String[] args) {
        arrayList();

    }

    private static void stack() {
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("foo");
        stringStack.push("duo");

        System.out.println(stringStack.pop());
        System.out.println(stringStack.peek());

        stringStack.push("yan");

    }

    private static void arrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("foo");
        arrayList.add("duo");
        System.out.println(arrayList.get(0));
        arrayList.set(1, "yan");
        System.out.println(arrayList.remove(1));
        arrayList.clear();
        arrayList.add("f");
        System.out.println(arrayList.contains("f"));

    }
}
