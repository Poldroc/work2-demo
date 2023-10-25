package com.west2.java.work2;

/**
 * 动物未找到异常类
 *
 * @author Poldroc
 * @date 2023/10/25
 */
public class AnimalNotFoundException extends RuntimeException {
    public AnimalNotFoundException(String message) {
        super(message);
    }
}

