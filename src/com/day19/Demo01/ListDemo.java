package com.day19.Demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口派系，继承Collection接口
 *  下面有很多实现类
 * List接口特点：有序，索引，可以重复元素
 *  实现类，ArrayLis，LinkedList
 *
 *  List接口中的抽象方法，有一部分方法和他的父接口Collection是一样
 *  List接口的自己特有的方法，带有索引功能
 */
public class ListDemo {
    public static void main(String[] args) {
        function();
    }

    /**
     * add(int index, E)
     * 将元素插入到列表的指定索引
     */
    public static void function(){
        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        System.out.println(list);

        list.add(1,"itcast");
        System.out.println(list);

    }


}
