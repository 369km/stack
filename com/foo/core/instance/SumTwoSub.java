package com.foo.core.instance;

public class SumTwoSub {
    /**
     * 找到数组中和为指定值的两个元素
     *
     * @param array 必须排序
     * @param sum   两个元素之和
     */
    public void findTwoSubInSum(int[] array, int sum) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int sumtemp = array[i] + array[j];
            if (sum == sumtemp) {
                System.out.println(array[i] + "+" + array[j] + "=" + sum);
                return;
            } else if (sum > sumtemp) {
                i++;
            } else {
                j--;
            }
        }
    }
}
