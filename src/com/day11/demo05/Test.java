package com.day11.demo05;

/**
 * 多态的调用
 * 多态前提：
 *  1、要有继承
 *  2、方法的重写
 */
public class Test {
    public static void main(String[] args) {

        //多态的调用方法，方法必须运行子类的重写！！！

        //Java中，对象的多态性，调用程序中的方法
        //公式：父类类型或者是接口类型  变量 = new 子类的对象();
        Fu f = new Zi();
        f.show();

        //抽象类 Animal ，子类是Cat
        Animal a = new Cat();
        a.eat();

        //接口Smoking,实现类Student 实现多态的编写
        Smoking sk = new Student();
        sk.smoking();

    }
}
