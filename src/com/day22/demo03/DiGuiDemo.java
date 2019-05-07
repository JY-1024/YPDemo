package com.day22.demo03;

/**
 * 方法的递归调用
 *  方法自己调用自己
 * 适合于，方法中运算的主体不变，但是运行的时候，参与运算的方法参数会变化
 * 注意：
 *  递归一定要有出口，必须可以让程序停下
 *  递归次数不能过多
 *  构造方法，禁止递归调用
 */
public class DiGuiDemo {
    public static void main(String[] args) {
       int sum = getSum(100);
        System.out.println(sum);
    }

    /**
     * 计算1+2+3+100和 = 5050
     * 计算规律：
     *   1+n，n+(n-1)+(n-2)
     */
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n-1);

    }

}
