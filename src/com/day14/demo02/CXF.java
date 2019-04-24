package com.day14.demo02;

/**
 * 定义长方形类
 *  计算面积，周长
 *
 *  边长，设计的时候，定义为成员变量，两个计算方法的局部变量
 *  长和宽属于谁？属于长方形事物，每个独立计算的功能
 */
public class CXF {
    private int w;
    private int h;

    public CXF(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getArea(int w, int h){
        return w * h;
    }

    public int getLong(int w, int h){
        return (w+h)*2;
    }
}
