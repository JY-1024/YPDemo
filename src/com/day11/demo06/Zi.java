package com.day11.demo06;

public class Zi extends Fu {
    int a = 2;

    @Override
    public void show() {
        super.show();
        System.out.println("父类的方法");
    }
}
