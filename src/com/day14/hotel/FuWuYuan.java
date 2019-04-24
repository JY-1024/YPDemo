package com.day14.hotel;

public class FuWuYuan extends Employee implements VIP {
    public FuWuYuan() {
    }

    public FuWuYuan(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("服务员在上菜");
    }

    @Override
    public void services() {
        System.out.println("服务器给顾客倒酒");
    }
}
