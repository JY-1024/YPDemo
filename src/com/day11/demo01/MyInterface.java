package com.day11.demo01;

/***
 * 定义接口
 *  使用关键字interface 接口名字
 * 接口定义：
 *  成员方法，全抽象
 *  不能定义带有方法体的方法
 *
 *  定义抽象方法：固定格式
 *      public abstract 返回值类型  方法名字（参数列表）;
 *
 *  接口中的方法均为公共访问的抽象方法
 *  接口中无法定义普通的成员变量
 */
public interface MyInterface {

    //在接口中，定义抽象方法
    public abstract void function();
}
