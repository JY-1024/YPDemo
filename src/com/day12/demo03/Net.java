package com.day12.demo03;

public class Net extends Maintainer {

    public Net(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(super.getName()+"..."+super.getId()+"...正在检查网络是否畅通");
    }
}
