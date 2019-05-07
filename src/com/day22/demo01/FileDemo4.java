package com.day22.demo01;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        function_1();
    }
    /**
     * File类判断功能
     * boolean isDirectory()
     * 判断File构造方法中封装的路径是不是文件夹
     * 如果是文件夹，返回true，不是文件返回false
     *
     * boolean isFile()
     * 判断File构造方法中封装的路径是不是文件
     */
    public static void function_1(){
        File file = new File("/Users/jerry/Desktop/fileDemo/abc");
        boolean b = file.isDirectory();
        System.out.println(b);
    }
    /**
     * File判断功能
     * boolean exists()
     * 判断File构造方法中封装路径是否存在
     * 存在返回true，不存在返回false
     */
    public static void function(){
        File file = new File("/Users/jerry/Desktop/fileDemo/a.txt");
        boolean b = file.exists();
        System.out.println(b);
    }

}
