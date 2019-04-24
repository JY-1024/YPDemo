package com.day15.demo02;

import java.sql.SQLOutput;

public class StringTest {
    public static void main(String[] args) {
        getCount("A%A3eBr1FFy");

        String str = toConvert("aBcdEF");
        System.out.println(str);

        //
       int number = getStringCount("hellojava,nijavahaojava,javazhengbang","java");
        System.out.println(number);
    }

    /**
     * 获取一个字符串中，另一个字符串出现的次数
     * 思想：
     *  1、indexOf到字符串中找到第一次出现的索引
     *  2、找到的索引+被找字符串的长度，截取字符串
     *  3、计数器++
     */
    public static int getStringCount(String str,String key) {
        //定义计数器
        int count = 0;
        //定义变量，保存indexof查找后的索引结果
        int index = 0;
        //开始循环查找，条件，indexof == -1 字符串没有了
        while ((index = str.indexOf(key)) != -1) {
            count++;
            str = str.substring(index + key.length());
        }
        return count;
    }

    /*
        将字符串的首字母转成大写，其他内容转成小写
        思想：
            获取首字母，charAt(0)  subString(0,1)
            转成大写toUpperCase()

            获取剩余字符串，subString(1)  toLowerCase()
     */
    public static String toConvert(String str) {
        //定义变量，保存首字母，和剩余字符
        String first = str.substring(0,1);
        String after = str.substring(1);
        //调用String类方法，大写，小写转换
        first = first.toUpperCase();
        after = after.toLowerCase();

        return first + after;
    }

    /**
     * 获取指定字符串中，大写字母，小写字母，数字的个数
     * 思想：
     *  1、计数器，就是int变量，满足一个条件++
     *  2、遍历字符串，长度方法length() + charAt() 遍历
     *  3、字符判断是大写还是小写还是数字
     */
    public static void getCount(String str) {
        //定义三个变量，计数
        int upper = 0;
        int lower = 0;
        int digit = 0;
        //对字符串进行遍历
        for (int i = 0; i <str.length() ; i++) {
            //String方法charAt,索引，获取字符
            char c = str.charAt(i);
            //利用编码表 65-90  97-122  48-57
            if (c >= 65 && c <=90){
                upper++;
            } else if (c>=97 && c<= 122) {
                lower++;
            } else if (c >= 48 && c <=57 ){
                digit++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(digit);
    }
}
