package com.foo.core;

import com.foo.core.collect.*;
import com.foo.core.instance.MaxSumSubArray;
import com.foo.core.instance.SumTwoSub;
import com.foo.core.sort.InsertSort;

public class Test {
    public static void main(String[] args) {
        stack2Queue();

    }

    private static void stack() {
        Stack<String> stringStack = new Stack<String>(1);
        stringStack.push("foo");
        System.out.println(stringStack.isFull());
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
        int[] b = {1, 9, -6, 3, -7, 4, 5, -2};
        sumTwoSub.findTwoSubInSum(b, 10);
    }

    public static void insertSort() {
        int[] b = {1, 5, 3, 9, 7, 4, 15};
        InsertSort insertSort = new InsertSort(b);
        insertSort.sort();
        System.out.println(b);
    }

    public static void maxSumSubArray() {
        int[] b = {1, 9, -6, 3, -7, 4, 5, -2};
        MaxSumSubArray maxSumSubArray = new MaxSumSubArray(b);
        maxSumSubArray.find();
    }

    public static void queue(){
        ArrayQueue integerArrayQueue = new ArrayQueue(5);
        System.out.println(integerArrayQueue.isEmpty());
        integerArrayQueue.put("1");
        integerArrayQueue.put("3");
        integerArrayQueue.put("2");
        integerArrayQueue.put("4");
        integerArrayQueue.put("5");
        System.out.println(integerArrayQueue.isFull());
        integerArrayQueue.put("6");
        System.out.println(integerArrayQueue.size());
        System.out.println(integerArrayQueue.peek());
        System.out.println(integerArrayQueue.poll());
        System.out.println(integerArrayQueue.poll());
    }
    public static void stack2Queue(){
        Stack2Queue<Integer> queue = new Stack2Queue<>(4);
        queue.put(1);
        queue.put(2);
        queue.put(3);
        queue.put(4);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
