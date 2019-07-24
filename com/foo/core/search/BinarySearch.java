package com.foo.core.search;

import com.foo.core.sort.QuickSort;

public class BinarySearch {
    private int[] array;

    public BinarySearch(int[] array) {
        QuickSort quickSort = new QuickSort(array);
        quickSort.sort();
        this.array = array;
    }

    public int search(int target) {
        if (array != null) {
            return binarySearch(target, 0, array.length - 1);
        }
        return -1;
    }

    private int binarySearch(int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(target, 0, mid - 1);
        } else {
            return binarySearch(target, mid + 1, end);
        }
    }
}
