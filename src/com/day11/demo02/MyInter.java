package com.day11.demo02;

/**
 * 接口中成员的特点
 *  1、成员变量的特点，没有变量，都是常量
 *  固定格式：public static final 数据类型 变量名 = 值
 *
 *  注意：public static final 修饰符，在接口的定义中，可以省略不写
 *  但是，不写不等于没有
 *  三个修饰符，还可以选择性书写
 */
public interface MyInter {
    public static final int x = 3;
}
