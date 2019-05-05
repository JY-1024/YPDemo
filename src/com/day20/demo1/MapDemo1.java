package com.day20.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 *  利用键获取值
 *  map接口中定义方法keyset
 *  所有的键，存储到Set集合
 */
public class MapDemo1 {
    public static void main(String[] args) {
        function();
    }
    /**
     * 1、调用map集合的方法keySet,所有的键存储到Set集合中
     * 2、遍历Set集合，获取出Set集合中的所有元素(Map中的键)
     * 3、调用map集合方法get，通过键获取到值
     */
    public static void function(){
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("a",11);
        map.put("b",12);
        map.put("c",13);
        map.put("d",14);
        System.out.println(map);

        // 1、调用map集合的方法keySet,所有的键存储到Set集合中
        Set<String> keySet = map.keySet();

        // 2、遍历Set集合，获取出Set集合中的所有元素(Map中的键)
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            //3、调用map集合方法get，通过键获取到值
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "...." + value);
        }

    }
}
