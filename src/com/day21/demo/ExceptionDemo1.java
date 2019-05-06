package com.day21.demo;

/**
 * try catch 使用
 */
public class ExceptionDemo1 {
    public static void main(String[] args) throws NullPointerException,ArrayIndexOutOfBoundsException {
        int[] arr = new int[0];
        try {
            int i = getArray(arr);
            System.out.println(i);

        } catch (NullPointerException ex) {
            System.out.println(ex);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("!!!!!!" + ex);
        }

        System.out.println("Game Over");
    }

    /**
     * 定义方法，抛出异常
     * 调用者使用try catch
     * @param arr
     * @return
     */
    public static int getArray(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException {
        //对数组判空
        if (arr == null) {
            //手动抛出异常
            throw new NullPointerException("数组不存在");
        }
        //对数组的索引进行判断
        if (arr.length < 3) {
            throw new ArrayIndexOutOfBoundsException("数组没有3索引");
        }
        return arr[3] + 1;
    }
}
