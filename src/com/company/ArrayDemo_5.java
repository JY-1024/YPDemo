package com.company;

/*
    计算数组中的最大值
    数组 {4,1,7,5}做比较
 */
public class ArrayDemo_5 {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,6,8,0,3};
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
