package com.day23.demo1;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputSteam读取文件
 *  读取方法 int read(byte[] b) 读取字节数组
 *  数组作用
 *  read返回的int，表示什么含义
 */
public class FileInputSteamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/jerry/Desktop/fileDemo/a.txt");
        //创建字节数组
        byte[] b = new byte[2];
        int len = fis.read(b);
        while ((len = fis.read(b)) != -1) {
            System.out.print(new String(b,0,len));
        }
        fis.close();
    }
}
