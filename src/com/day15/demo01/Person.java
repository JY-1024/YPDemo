package com.day15.demo01;

public class Person {
    private String name;
    private int age;

    /**
     * 将父类的equals方法写过来，重写父类的方法
     * 但是，不改变父类方法的源代码，方法equals 比较两个对象的内存地址
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    public Person() {
    }

    public Person(String name, int age) {
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
