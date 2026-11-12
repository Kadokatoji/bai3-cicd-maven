package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger log = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        log.info("Cong {} + {}", a, b);
        return a + b;
    }

    public int divide(int a, int b) {
        log.debug("Chia {} / {}", a, b);
        if (b == 0) {
            log.error("Chia cho 0!");
            throw new ArithmeticException("Khong the chia cho 0");
        }
        return a / b;
    }
}