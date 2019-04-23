package com.day11.demo02;

/**
 * 接口中成员的特点
 *  1、成员变量的特点，没有变量，都是常量
 *  固定格式：public static final 数据类型 变量名 = 值
 *
 *  注意：public static final 修饰符，在接口的定义中，可以省略不写
 *  但是，不写不等于没有
 *  三个修饰符，还可以选择性书写
 *
 *  2。接口中的成员方法特点：
 *  public abstract 返回值类型 方法名（参数列表）
 *  修饰符 public abstract 可以不写，选择性书写
 *  但是，写不写，都有
 */
public interface MyInter {
    public static final int x = 3;

    void show();
}
