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
        int size = array.size();
        System.out.println(size);

        String s = array.get(1);
        System.out.println(s);

        for (int i = 0; i < size ; i++) {
            System.out.println(array.get(i));
        }

        //遍历




    }
}
