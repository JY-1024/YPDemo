package com.day16.demo01;

public class RegexMailDemo {
    public static void main(String[] args) {
        checkMail();
    }
    /**
     * 检查邮箱地址是否合法
     * 规则：
     * 1234567@qq.com
     * mymail@sina.com
     * nimail@163.com
     * nimail@126.com
     * wodemail@yahoo.com.cn
     *
     * @: 前 数字、字母、_ 个数不能少于1个
     * @：后 数字、字母
     */
    public static void checkMail(){
        String email = "abc123@sina.com.cn";
        boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
        System.out.println(b);
    }
}
