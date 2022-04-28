package com.emard.lamdas.defaults;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MathOperationsExample implements Calculator{

    public static void main(String[] args) {
        MathOperationsExample mExample = new MathOperationsExample();
        log.info("Sum {}", mExample.sum(2, 4));
        //our implementation using lambda expression for sum and divide
        Calculator calculator = (x, y) -> x + y;
        log.info("Sum {}", calculator.sum(2, 4));
        log.info("Substract {}", mExample.subtract(4, 20));
        log.info("Multiply {}", Calculator.multiply(4, 20));

    }
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    
}
