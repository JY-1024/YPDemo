package com.day19.demo03;

/**
 * 对象的哈希值，普通的十进制数
 * 父类Object，方法public int hashCode()计算结果int整数
 */
public class HashDemo {
    public static void main(String[] args) {
        Person p = new Person();
        int i = p.hashCode();
        System.out.println(i);
    }
}
