package com.day10.demo08;

public abstract class Employee {
    //姓名
    private String name;
    //工号
    private String Id;

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
