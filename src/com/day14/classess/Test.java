package com.day14.classess;

/**
 * Person类，当作方法的参数
 * Person类型写在方法的参数列表中
 *
 */
public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        operationPerson(p);

        operationPerson(new Person());
    }

    /**
     *
     * @param p
     */
    public static void operationPerson(Person p){
        p.eat();
        p.run();
    }

}
