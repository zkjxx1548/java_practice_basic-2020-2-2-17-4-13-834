package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int[] res = Arrays.copyOf(array, array.length+1);
        int index = array.length;
        for (int i=0; i<res.length; i++) {
            if (number < res[i]) {
                index = i;
                break;
            }
        }
        for (int i=res.length-1; i>index; i--) {
            res[i] = res[i-1];
        }
        res[index] = number;
        return res;
    }
}
