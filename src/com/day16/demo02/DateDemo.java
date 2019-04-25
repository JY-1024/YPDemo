package com.day16.demo02;

import java.util.Date;

/**
 * 时间和日期类
 *  java.util.Date
 *
 *  毫秒概念：1000毫秒=1秒
 *
 *  毫秒的0点：
 *  System.currentTimeMillis() 返回值long类型参数
 *  获取当前日期的毫秒值  1556161269563
 *  时间原点；公元1970年1月1日，午夜0:00:00  毫秒值就是0
 *  现在时间是 2088年8月8日
 *
 *  重要：时间和日期的计算，必须依赖毫秒值
 *
 */
public class DateDemo {
    public static void main(String[] args) {
//       long time = System.currentTimeMillis();
//        System.out.println(time);
//        function();
        function_1();
    }

    /**
     * Date类的long参数的构造方法
     * Date(long) 表示毫秒值
     * 传递毫秒值，将毫秒值转成对应的日期对象
     */
    public static void function_1(){
        Date date = new Date(0);
        System.out.println(date);
    }

    /**
     * Date类空参数构造方法
     * 获取到的是，当前操作系统中的时间和日期
     */
    public static void function(){
        Date date = new Date();
        System.out.println(date);
    }
}
