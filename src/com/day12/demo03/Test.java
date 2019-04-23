package com.day12.demo03;

public class Test {
    public static void main(String[] args) {
        JavaEE ee = new JavaEE("张三","开发部001");
        ee.work();

        Net net = new Net("李四","维护部005");
        net.work();

    }
}
