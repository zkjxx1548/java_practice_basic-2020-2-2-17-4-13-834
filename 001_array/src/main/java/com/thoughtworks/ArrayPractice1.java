package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {
        printArrayReverse();
    }

    /**
     * 倒序打印给定数组,打印格式为: [3,2,1]
     */
    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};
        int[] res = new int[array.length];
        int index = 0;
        for (int i=array.length-1; i>=0; i--) {
            res[index] = array[i];
            index++;
        }
        System.out.println(Arrays.toString(res));
    }
}
