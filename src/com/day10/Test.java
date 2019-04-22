package com.day10;

public class Test {
    public static void main(String[] args) {
        Develop d = new Develop();
        d.name = "张三";
        d.work();

        //维护员工类的对象
        WeiHu w = new WeiHu();
        w.name = "历史";
        w.print();
        w.work();
    }
}
