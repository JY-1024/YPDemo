package com.day16.demo03;

import java.util.Calendar;

public class CalendarDemo1 {
    public static void main(String[] args) {
//        function();
        function_2();
    }

    /**
     *  Calendar类的set方法
     *  设置日历
     *  set(int field,int value)
     *  field 设置的是哪个日历字段
     *  value 设置后的具体数值
     *
     *  set(int year,int month,int day)
     *  传递3个整数的年，月，日
     */
    public static void function_2(){
        Calendar c = Calendar.getInstance();
        //设置，月份，设置到10月份
        c.set(Calendar.MONTH,9);

        //设置年，月，日 2099年5月1日
        c.set(2099,4,1);

        //获取年份
        int year = c.get(Calendar.YEAR);
        //获取月份
        int month = c.get(Calendar.MONTH)+1;
        //获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年"+month+"月"+day+"日");
    }
    /**
     * Calendar类的get方法
     * 获取日历字段的值
     *  int get(int)
     *  参数int，获取的哪个日历字段
     *  返回值，就表示日历字段的具体数值
     */
    public static void function(){
        Calendar c = Calendar.getInstance();
        //获取年份
        int year = c.get(Calendar.YEAR);
        //获取月份
        int month = c.get(Calendar.MONTH)+1;
        //获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年"+month+"月"+day+"日");
    }
}
