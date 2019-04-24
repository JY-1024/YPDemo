package com.day14.hotel;

/**
 * 定义经理类
 *  属于员工一种，没有VIP功能
 *  自己有奖金属性
 */
public class JingLi extends Employee {

    //定义奖金属性
    private double money;

    public JingLi() {
    }

    public JingLi(String name, String id,double money) {
        super(name, id);
        this.money = money;
    }

    @Override
    public void work() {
        System.out.println("管理，谁出错我罚谁");
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
