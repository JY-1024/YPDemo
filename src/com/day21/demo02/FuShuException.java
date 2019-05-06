package com.day21.demo02;

/**
 * 自定义异常
 *    继承Exception,或者RuntimeException
 */
public class FuShuException extends RuntimeException {
    public FuShuException() {
    }

    public FuShuException(String message) {
        super(message);
    }
}
