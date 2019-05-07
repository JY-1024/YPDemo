package com.day22.demo02;

import java.io.File;
import java.io.FileFilter;

/**
 * 自定义过滤器
 * 实现FileFilter接口，重写抽象方法
 */
public class MyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        System.out.println(pathname + "#########################");
        /**
         * pathname 接受到的也是文件的全路径
         * /Users/jerry/Desktop/fileDemo
         * 对路径进行判断，如果是java文件，返回true，不是java文件，返回false
         * 文件的后缀结尾是.java
         */
        String name = pathname.getName();
        return name.endsWith(".java");
    }
}
