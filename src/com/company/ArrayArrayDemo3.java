package com.company;

/*
    二维数组的遍历求和
    第一小组销售额为{11,12}万元
    第二小组销售额为{21,22，23}万元
    第三小组销售额为{31,32，33，34}万元
    每个小组就是一个数组，三个数组存储到一个数组中，形成二维数组
    求和：
        每个小组求和
        所有元素求和
 */
public class ArrayArrayDemo3 {
    public static void main(String[] args) {
        int[][] arr = {{11,12},{21,22,23},{31,32,33,34}};
        int sum = 0;
        int groupSum = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                groupSum += arr[i][j];
            }
            System.out.println("每个小组总金额："+groupSum);
            sum += groupSum;
            groupSum = 0;
        }
        System.out.println("本公司总金额:"+sum);
    }
}
