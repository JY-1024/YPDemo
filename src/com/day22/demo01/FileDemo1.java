package com.day22.demo01;

import java.io.File;

/**
 * File类的构造方法
 * 三种重载形式
 *
 * 路径：
 *  绝对路径
 *      在系统中具有唯一性
 *      c:\\windows\\system32
 *      http://www.itcast.cn
 *
 *  相对路径
 *      表示的是路径之间的相对关系
 *
 */
public class FileDemo1 {
    public static void main(String[] args) {
        function_2();
    }
    /**
     * File(File parent,String child)
     * 传递路径，传递File类型的父路径，字符串子路径
     * 好处：父路径是file类型，父路径可以直接调用File类方法
     */
    public static void function_2(){
        File parent = new File("/Users/jerry/Desktop");
        File file = new File(parent,"SwiftProjectOne");
        System.out.println(file);
    }
    /**
     * File(String parent,String child)
     * 传递路径，传递字符串的父路径，字符串子路径
     * 好处：单独操作父路径和子路径
     */
    public static void function_1(){
        File file = new File("/Users/jerry/Desktop/","SwiftProjectOne");
        System.out.println(file);
    }
    /**
     * File(String pathname)
     * 传递路径名：可以写到文件夹，可以写到一个文件
     * c:\\abc   c:\\abc\Demo.java
     * 将路径封装成File类型对象
     */
    public static void function(){
        File file = new File("/Users/jerry/Desktop/SwiftProjectOne/Podfile.lock");
        System.out.println(file);
    }
}
