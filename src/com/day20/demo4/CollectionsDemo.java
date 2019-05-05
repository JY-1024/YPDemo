package com.day20.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        function_2();
    }

    /**
     * Collections.shuffle方法
     * 对List集合中的元素，进行随机排列
     */
    public static void function_2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(15);
        list.add(14);
        list.add(20);
        System.out.println(list);
        //调用工具类方法shuffle对集合随机排列
        Collections.shuffle(list);
        System.out.println(list);
    }

    /**
     * Collections.binarySearch 静态方法
     * 对list集合进行二分搜索，方法参数，传递List集合，传递被查找的元素
     */
    public static void function_1(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);
        list.add(14);
        list.add(20);
        //调用工具类静态方法binarySearch
        int index = Collections.binarySearch(list,21);
        System.out.println(index);

    }
    /**
     * Collections.sort静态方法
     * 对于List集合，进行升序排列
     */
    public static void function(){
        //创建List集合
        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("bbc2");
        list.add("babc3");
        list.add("acbc4");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("排序后的数组："+list);

    }
}
