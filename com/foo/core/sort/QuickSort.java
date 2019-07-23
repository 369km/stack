package com.foo.core.sort;

/**
 * 快速排序是对冒泡排序的改进，交换次数少，速度快，最慢也是O(n^2),平均速度为O(nlogn),空间为O(logn)
 */
public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        if (array==null || array.length==0){
            throw new RuntimeException(" array cant be empty");
        }
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int key = array[begin];
            int i = begin;
            int j = end;
            while (i < j) {
                while (i < j && array[j] > key) {
                    j--;
                }
                if (i < j) {
                    array[i] = array[j];
                    i++;
                }
                while (i < j && array[i] < key) {
                    i++;
                }
                if (i < j) {
                    array[j] = array[i];
                    j--;
                }

            }
            array[i] = key;
            quickSort(array, begin, i - 1);
            quickSort(array, i + 1, end);
        }
    }
}
