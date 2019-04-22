package com.day10.demo08;

public class Test {
    public static void main(String[] args) {
        JavaEE ee = new JavaEE();
        ee.setName("小米");
        ee.setId("yanfabu001");
        ee.work();

        Network net = new Network();
        net.setName("网络");
        net.setId("wangluobu007");
        net.work();

        System.out.println(ee.getName()+"..."+ee.getId());
        System.out.println(net.getName()+"..."+net.getId());
    }
}
