package com.day16.demo01;

public class RegexDemo2 {
    public static void main(String[] args) {
        replaceAll_1();
    }
    /**
     * "Hello12345World6789012"将所有数字替换
     * String类方法replaceAll(正则规则，替换后的新字符串)
     */
    public static void replaceAll_1(){
        String str = "Hello12345World6789012";
        str = str.replaceAll("[\\d]+","#");
        System.out.println(str);
    }
}
