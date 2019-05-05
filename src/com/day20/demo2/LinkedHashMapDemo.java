package com.day20.demo2;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        System.out.println(map);
        for (String key: map.keySet()) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
