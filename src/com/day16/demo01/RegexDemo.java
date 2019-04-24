package com.day16.demo01;

/**
 * 实现正则规则和字符串进行匹配，使用字符串类的方法
 * String类三个和正则表达式相关的方法
 *  boolean matches(String 正则的规则)
 *  "abc".matches("[a]") 匹配成功返回true
 *
 *  String[] split(String 正则的规则)
 *  "abc".split("a") 使用规则将字符串进行切割
 *
 *  String replaceAll(String 正则规则,String 字符串)
 *  "abc0123".replaceAll("[\\d]","#")
 */
public class RegexDemo {
    public static void main(String[] args) {
        checkQQ();
        checkTel();
    }

    /**
     * 检查手机号码是否合法
     * 1开头，可以是345678 0-9 位数固定11位
     */
    public static void checkTel(){
        String telNumber = "13351258005";
        boolean b = telNumber.matches("1[345678][\\d]{9}");
        System.out.println(b);
    }

    /**
     * 检查qq号码是否合法
     * 0不能开头，全数字，位数5，10位
     * 123456
     * \\d
     */
    public static void checkQQ(){
        String QQ = "123456";
        //检查QQ号码和规则是否匹配，String累的方法matches
        boolean b = QQ.matches("[1-9][\\d]{4,9}");
//        boolean b = QQ.matches("[1-9][0-9]{4,9}");
        System.out.println(b);
    }


}
