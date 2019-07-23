package com.foo.core.sort;

/**
 * 插入排序的时间复杂度为O(n^2)，性能比较差，和冒泡差不多,空间复杂度为O(1),只需要一个temp变量存储，该算法是稳定的
 */
public class InsertSort {
    private int[] array;

    public InsertSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        if (array == null || array.length == 0) {
            throw new RuntimeException(" array cant be empty");
        }
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            for (; j > 0 && array[j - 1] > temp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
    }
}
