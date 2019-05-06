package com.day21.demo02;

/**
 * 异常分为 编译异常 和 运行时期异常
 *   编译异常：调用了抛出异常的方法，不处理编译失败(try throws)
 *   运行异常: 抛出的异常是RuntimeException类，或者是他的子类
 *
 * 运行异常的特点：
 *     方法内部抛出的异常是运行异常，new XXXException
 *     方法的声明上，不需要throws语句,调用者，也不需要处理
 *     设计原因：
 *      运行异常，不能发生，但是如果发生了，程序人员停止程序修改源代码
 *
 *      运行异常：一旦发生，不要处理，请修改源代码，运行异常一旦发生，后面的代码没有执行的意义
 */
public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        function();
    }

    public static void function(){
//        throw new Exception();
    }
}
