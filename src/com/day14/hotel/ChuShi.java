package com.day14.hotel;

public class ChuShi extends Employee implements VIP {

    public ChuShi() {
    }

    public ChuShi(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("厨师在炒菜");
    }

    @Override
    public void services() {
        System.out.println("厨师做菜加量");
    }
}
