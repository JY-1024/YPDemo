package com.day15.demo01;

/**
 * Equals 方法比较内存地址
 */
public class TestEquals {
    public static void main(String[] args) {
        // Person类继承Object类，继承下来了父类的方法equals
        Person p1 = new Person("李四",25);
        Person p2 = new Person("张三",20);

        //Person对象p1,调用父类的equals方法，进行对象的比较
        boolean b = p1.equals(p2);
        System.out.println(b);

        //运行后，结果是false
        /**
         * 引用类型里面 == 用于比较对象的内存地址是否相同
         */

    }
}
