package com.day22.demo03;

import java.io.File;

/**
 * 对一个目录的下的所有内容，进行完全的遍历
 * 编程技巧，方法的递归调用，自己调用自己
 */
public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("/Users/jerry/Desktop/fileDemo");
        getAllDir(dir);
    }
    /**
     * 定义方法，实现目录的全遍历
     */
    public static void getAllDir(File dir) {
        //调用方法listFiles()对目录，dir进行遍历
        File[] fileArr = dir.listFiles();
        for (File f : fileArr) {
            if (f.exists()){
                if (f.isDirectory()) {
                    getAllDir(f);
                }
            }

            System.out.println(f);
        }
    }
}
