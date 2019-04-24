package com.day15.demo02;

public class StringBufferDemo {
    public static void main(String[] args) {
        function();
    }
    /**
     * StringBuffer类的使用
     * append，将任意类型的数据，添加到缓冲区中
     */
    public static void function(){
        StringBuffer buffer = new StringBuffer();
        buffer.append(6);
        System.out.println(buffer);
    }
}
