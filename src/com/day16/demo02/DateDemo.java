package com.day16.demo02;

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
       long time = System.currentTimeMillis();
        System.out.println(time);
    }

}
