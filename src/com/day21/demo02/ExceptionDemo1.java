package com.day21.demo02;

/**
 * Throwable类中的方法
 * 三个方法，都和异常的信息有关系
 *  String getMessage() 对异常信息的详细描述
 *  String toString()   对异常信息的简短描述
 *  void printStackTrace() 将异常信息追踪到标准的错误流
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            function();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            ex.printStackTrace();
//            System.out.println(ex.printStackTrace());
        }
    }

    public static void function() throws Exception{
        throw new Exception("异常了！");
    }
}
