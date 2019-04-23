package com.day12.demo03;

public class JavaEE extends Developer {

    public JavaEE(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(super.getName()+"..."+super.getId()+"...开发淘宝");
    }
}
