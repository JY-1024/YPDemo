package com.company;

import java.util.Scanner;
import java.util.Random;

public class GuestNumber {
    public static void main(String[] args) {
        System.out.println("猜数字开始了");
        System.out.println("请输入1-100之间的数字");
        Random ran = new Random();
        int ranNumber = ran.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();
            if (number > ranNumber){
                System.out.println("猜大了");
            } else if (number < ranNumber){
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }

    }
}
