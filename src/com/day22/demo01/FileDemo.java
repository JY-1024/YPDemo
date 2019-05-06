package com.day22.demo01;

import java.io.File;

/**
 * java.io.File
 *  将操作系统中的文件，目录（文件夹），路径，封装成File对象
 *  提供方法，操作系统中的内容
 *  File与系统无关的类
 *  文件File
 *  目录directory
 *  路径path
 */
public class FileDemo {
    public static void main(String[] args) {
        //File类静态成员变量
        //与系统有关的路径分隔符
        String separator = File.pathSeparator;
        System.out.println("路径分割符："+separator); //windows系统是一个分号，目录的分割  Linux系统是冒号 :

        separator = File.separator;
        System.out.println(separator); // 向右 \ 目录名称分割，在Linux中是 /


    }
}
