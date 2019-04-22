package com.company;
/*
    随机点名器：
        1、存储姓名
        2、预览所有人的姓名
        3、随机出一个人的姓名
 */
import java.util.Random;

public class CallName {
    public static void main(String[] args) {
        String[] names = {"张三","李四","王五","李雷","韩梅梅","小明","老王","小花","王鹏","王菲"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("============================");

        //随机出一个姓名
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        System.out.println(names[index]);

    }
}
