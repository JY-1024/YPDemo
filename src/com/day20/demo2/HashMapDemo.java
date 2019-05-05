package com.day20.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用HashMap集合，存储自定义的对象
 * 自定义对象，作为键，出现，作为值出现
 */
public class HashMapDemo {
    public static void main(String[] args) {
        function();
    }
    /**
     * HashMap 存储自定义的对象Person，作为值出现
     */
    public static void function(){
        HashMap<String,Person> map = new HashMap<String, Person>();
        map.put("beijing",new Person("a",20));
        map.put("tianjin",new Person("b",18));
        map.put("shanghai",new Person("c",19));
        System.out.println(map);

        for (String key: map.keySet()) {
            Person value = map.get(key);
            System.out.println(key+"..."+value);
        }
        System.out.println("==========================");
        for (Map.Entry<String,Person> entry: map.entrySet()) {
            String key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key+"...."+value);
        }
    }
}
