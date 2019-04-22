package com.company;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("abc");
        array.add("1234");
        array.add("yyyyy");
        array.add("ppppp");
        array.add("rrrrr");
        //在索引2 位置添加 xiaoming
        array.add(2,"xiaoming");
        int size = array.size();
        System.out.println(size);

        //获取某个元素
        String s = array.get(0);
        System.out.println(s);

        System.out.println("==================================");

        //set(int 索引,修改后的元素) 将指定索引的元素，进行修改
        array.set(0,"88888");

        for (int i = 0; i < size ; i++) {
            System.out.println(array.get(i));
        }

        //删除指定索引位置的元素
        array.remove(4);
        System.out.println("=================================");
        for (int i = 0; i < array.size() ; i++) {
            System.out.println(array.get(i));
        }

        //clear() 清空元素，但集合还存在
        array.clear();
        for (int i = 0; i < array.size() ; i++) {
            System.out.println(array.get(i));
        }


    }
}
