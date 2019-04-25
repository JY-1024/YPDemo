package com.day16.demo04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class DateTest {
    public static void main(String[] args) throws Exception {
//        function();
        function_1();
    }

    /**
     * 闰年计算
     * 2000 3000
     * 高级算法：日历设置到指定年份的3月1日，add向前偏移1天，获取天数，如果是29天是闰年,28天是平年
     */
    public static void function_1(){
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        //get方法获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
    /**
     * 计算活了多少天
     * 生日  今天的日期
     * 两个日期，变成毫秒值，做减法
     *
     */
    public static void function() throws Exception {
        System.out.println("请输入出生日期 格式YYYY-MM-dd");
        //获取出生日期，键盘输入
        String birthdayString = new Scanner(System.in).next();
        //将字符串日期，转成Date对象
        //创建SimpleDateFormat对象，写日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //调用方法parse，字符串转成日期对象
        Date birthdayDate = sdf.parse(birthdayString);

        //获取今天的日期对象
        Date todayDate = new Date();

        //将两个日期转成毫秒值，Date类的方法getTime
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long second = todaySecond - birthdaySecond;

        if (second < 0) {
            System.out.println("还没出生");
        } else {
            //将毫秒值转换为天数
            System.out.println(second/1000/60/60/24);
        }
    }

}
