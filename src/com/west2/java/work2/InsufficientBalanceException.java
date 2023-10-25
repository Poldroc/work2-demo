package com.west2.java.work2;

/**
 * 余额不足异常类
 *
 * @author Poldroc
 * @date 2023/10/25
 */
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
