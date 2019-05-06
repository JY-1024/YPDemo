package com.day21.demo;

/**
 * try {
 *     被检测的代码
 *     可能出现异常的代码
 * }catch(异常类名 变量){
 *     异常的处理方式
 *     循环，判断，调用方式，变量
 * }finally{
 *     必须要执行代码
 * }
 */
public class ExceptionDemo3 {
    public static void main(String[] args) throws Exception {
        try {
            function(0);
        } catch (Exception ex) {
            System.out.println(ex);

        } finally {
            System.out.println("这里的代码必须执行");
        }
    }

    public static void function(int a) throws Exception {
        if (a==0) {
            throw new Exception();
        }
    }
}
