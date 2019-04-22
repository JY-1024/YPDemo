package com.itcast.demo01;

/**
 * 属性和方法，都属于类的成员
 *
 * 属性，成员属性
 * 方法，成员方法
 */
public class Car {
    //定义Car类的属性

    //汽车颜色
    String color;
    //汽车轮胎个数
    int count;

    public void run() {
        System.out.println("汽车在跑:" + color + ":" + count);
    }

}
