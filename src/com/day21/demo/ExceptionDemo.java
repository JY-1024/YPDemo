package com.day21.demo;

/**
 * 异常中的关键字
 *  throw，在方法内部，抛出异常
 */
public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        int[] arr = null;
        int i = getArray(arr);
        System.out.println(i);
    }
    //对数组的最后索引*2，返回
    public static int getArray(int[] arr) throws Exception {
        //对方法参数进行合法性的判断，进行判断是不是null
        if (arr == null) {
            //抛出异常的形式，告诉调用者
            //关键字throw
            throw new Exception("传递数组不存在");
        }

        //对数组进行判断，判断数组中，是不是有元素
        if (arr.length == 0) {
            //抛出异常的形式，告诉调用者，数组没有元素
            throw new Exception("数组没有元素");
        }

        int i = arr[arr.length - 1];
        return i * 2;
    }

}
