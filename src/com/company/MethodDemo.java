package com.company;
/*
    方法的定义格式
        修饰符 返回值类型  方法的名字 （参数列表。。。）{
            方法的功能主体
            循环，判断，变量，比较，运算
            return;
        }
     修饰符：固定写法 public static
     返回值类型：方法在运算后，结果的数据类型
     方法名：自定义名字，满足标识符规范，方法名字首字母小写，后面每个单词首字母大写
     参数列表：方法的运算过程中，是否有未知的数据，如果有未知的数据，定义在参数列表上（定义变量）
     return：方法的返回，将计算的结果返回，结束方法
 */
public class MethodDemo {
    public static void main(String[] args) {
        int area = getArea(10,2);
        System.out.println(area);
    }

    /*
        要去：计算一个长方形的面积
     */
    public static int getArea(int height, int width){
        return height * width;
    }
}











