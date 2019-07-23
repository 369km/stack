package com.foo.core.instance;

/**
 * 求连加值最大的子数组
 */
public class MaxSumSubArray {
    private int[] array;

    public MaxSumSubArray(int[] array) {
        this.array = array;
    }

    /**
     * 只需要知道前一个最大累加和是否大于等于零
     */
    public void find() {
        int lastSum = 0;
        int start = 0;
        int end = 0;
        int maxSum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (lastSum >= 0) {
                lastSum += array[i];
            } else {
                lastSum = array[i];
                start=i;
            }
            if (maxSum < lastSum) {
                maxSum = lastSum;
                end = i;
            }
        }
        System.out.println("maxSum:" + maxSum);
        System.out.println("subArray:");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i]);
            if (i != end) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
