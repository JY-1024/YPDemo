package com.day11.demo07;

/**
 * 运算符
 * 比较运算符，结果真假值
 * 关键字，instanceof,比较引用数据类型
 *
 * p变量，是Student类型对象，还是Tearcher类型对象
 *
 * 引用变量 instanceof类名
 * p instanceof Student 比较，p是不是 Student 类型的对象，如果是， instanceof返回true
 *
 *
 * instanceof只能对有继承关系的判断
 *
 *
 */
public class Test {
    public static void main(String[] args) {
//        Person p = new Student();
        Person p = new Tearcher();

        boolean b = p instanceof Student;
        System.out.println(b);

//        b = p instanceof Animal;
        System.out.println(b);

        p.sleep();

    }
}
