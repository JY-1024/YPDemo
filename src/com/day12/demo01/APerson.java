package com.day12.demo01;

/**
 * 自定义的Person类，成员变量，name，age
 * 要求new person的同时，就指定好name，age的值
 * 实现功能，利用方法去实现，构造方法，构造起Constructor
 * 作用：在new的同时对成员变量赋值，给对象的属性初始化赋值 new Person 对属性 name，age赋值
 *
 * 构造方法的定义格式
 *      权限 方法名(参数列表){
 *
 *      }
 *      方法的名字，必须和类的名字完全一致
 *      构造方法不允许写返回值类型，void 也不能写
 *
 *      this.的方式，区分局部变量和成员变量同名情况
 *      this在构造方法之间的调用，语法this()
 *
 */
public class APerson {
    private String name;
    private int age;

    //定义出Person类的构造方法
    public APerson() {
        //this() 调用其他的构造方法
        //调用了有参数的构造方法
        this("李四",20);
    }

    public APerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
