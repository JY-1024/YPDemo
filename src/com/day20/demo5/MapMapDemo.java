package com.day20.demo5;

import java.util.HashMap;

/**
 * Map集合的嵌套，Map中存储的还是Map集合
 * 要求：
 *  传智博客
 *  Java基础班
 *      001 张三
 *      002 李四
 *  Java就业班
 *      001 王五
 *      002 赵六
 *  对以上数据进行对象的存储
 *  001 张三 键值对
 *  基础班：存储学号和姓名的键值对
 *  Java就业班：
 *  传智播客：存储的是班级
 */
public class MapMapDemo {
    public static void main(String[] args) {
        //定义基础班集合
        HashMap<String,String> javaSe = new HashMap<String, String>();
        //定义就业班集合
        HashMap<String,String> javaee = new HashMap<String, String>();
        //向就业班集合中，存储学生信息
        javaSe.put("001","张三");
        javaSe.put("002","李四");

        javaee.put("001","王五");
        javaee.put("002","赵六");
        //定义传智播客集合容器，键是班级名字，值是两个班级容器
        HashMap<String,HashMap<String,String>> czbk =
                new HashMap<String, HashMap<String, String>>();
        czbk.put("基础班",javaSe);
        czbk.put("就业班",javaee);

    }

    public static void keySet(HashMap<String,HashMap<String,String>> czbk){

    }
//    public static void entrySet(){
//
//    }
}
