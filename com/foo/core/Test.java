package com.foo.core;

import com.foo.core.collect.ArrayList;
import com.foo.core.collect.HashMap;
import com.foo.core.collect.Stack;
import com.foo.core.instance.SumTwoSub;
import com.foo.core.sort.QuickSort;

public class Test {
    public static void main(String[] args) {
        sumTwoSub();

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

    private static void hashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "val1");
        hashMap.put(17, "val17");
        hashMap.put(2, "val2");
        hashMap.put(3, "val3");
        hashMap.put(4, "val4");
        hashMap.remove(1);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.get(4));
        System.out.println(hashMap.get(17));
    }

    public static void sumTwoSub() {
        SumTwoSub sumTwoSub = new SumTwoSub();
        int[] b = {1, 5, 3, 9, 7, 15};
        sumTwoSub.findTwoSubInSum(b, 10);
    }
}
