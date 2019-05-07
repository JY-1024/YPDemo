package com.day22.demo02;

import java.io.File;

/**
 * File类获取功能
 * list
 * listFiles
 */
public class FileDemo {
    public static void main(String[] args) {
        function_2();
    }

    public static void function_2(){
        //获取系统中的所有根目录
        File[] fileArr = File.listRoots();
        for (File f:fileArr
             ) {
            System.out.println(f);
        }
    }
    /**
     * File类的获取功能
     * File[] listFiles()
     * 获取到，File构造方法中封装的路径中的文件和文件名（遍历一个目录）
     */
    public static void function_1(){
        File file = new File("/Users/jerry/Desktop/fileDemo");
        File[] files = file.listFiles();
        System.out.println(files.length);
        System.out.println("==================");
        for (File f:files) {
            System.out.println(f);
        }
    }
    /**
     * File类的获取功能
     * String[] list()
     * 获取到，File构造方法中封装的路径中的文件和文件名（遍历一个目录）
     */
    public static void function(){
        File file = new File("/Users/jerry/Desktop/fileDemo");
        String[] list = file.list();
        for (String str:list) {
            System.out.println(str);
        }
        System.out.println("================");
        System.out.println(list.length);
    }
}
