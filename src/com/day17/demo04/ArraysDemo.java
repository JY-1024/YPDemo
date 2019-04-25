package com.day17.demo04;
import java.util.Arrays;
/**
 * 数组的工具类，包含数组的操作
 * java.util.Arrays
 */
public class ArraysDemo {
    public static void main(String[] args) {
//        function();
        function_1();
    }

    /**
     * static int binarySearch(数组，被查找元素)
     * 数组的二分搜索法
     * 返回元素在数组中出现的索引
     */
    public static void function_1(){
        int[] arr = {1,4,7,9,11,15,18};
        int index = Arrays.binarySearch(arr,10);
        System.out.println(index);
    }

    /**
     *  static void sort(数组)
     *  对数组生序排列
     */
    public static void function(){
        int[] arr = {5,1,4,6,8,9,0};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
