package com.day17.demo01;

/**
 * Integer类，封装基本数据类型int，提高大量方法
 * 将字符串转成基本数据类型int
 */
public class IntegerDemo {
    public static void main(String[] args) {
//        function();
//        function_1();
        function_2();

    }

    /**
     * 如何将基本类型int，变成字符串
     *
     * int => String 任何类型+ "" 变成String类型
     *
     * Integer类中的静态方法toString()
     */
    public static void function_2(){
        int i = 3;
//        String s = i + "";
//        System.out.println(s);

        //方法二
        String str = Integer.toString(i);
        System.out.println(str);
    }

    /**
     * Integer类静态方法parseInt(String s,int radix)
     * radix基数
     * "110",2  含义 前面的数字是二进制的，但是方法parseInt运行结果都是十进制
     */
    public static void function_1(){
        int i = Integer.parseInt("110",2);
        System.out.println(i);
    }
    /**
     * Integer类中静态方法parseInt(String s)返回基本类型
     * 要求：字符串必须是数字格式的
     */
    public static void function(){
        int i = Integer.parseInt("12");
        System.out.println(i);

    }
}
