package com.day18.demo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         * 集合ArrayList，存储int类型数
         * 集合本身不接受基本类型，自动装箱存储
         */
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(11);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        /**
         * 集合存储自定义的Person类的对象
         */
        ArrayList<Person> arrayPer = new ArrayList<Person>();
        arrayPer.add(new Person("a",20));
        arrayPer.add(new Person("b",18));
        arrayPer.add(new Person("c",22));
        for (int i = 0; i < arrayPer.size(); i++) {
            System.out.println(arrayPer.get(i));
        }
    }
}
