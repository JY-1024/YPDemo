package com.day22.demo02;

import java.io.File;

/**
 * File类的获取，文件获取的过滤器
 * 遍历目录的时候，可以根据需要，只获取满足条件的文件
 * 遍历目录方法 listFiles()重载形式
 * listFiles(FileFilter filter)接口类型
 * 传递FileFilter接口的实现类
 * 自定义FileFilter接口实现类，重写抽象方法
 * 接口实现类对象传递到遍历方法listFiles
 */
public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("/Users/jerry/Desktop/fileDemo");
        File[] fileArr = file.listFiles(new MyFilter());
        for (File f:fileArr) {
            System.out.println("结果："+f);
        }
    }

}
