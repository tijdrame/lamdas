package com.emard.lamdas.funcprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a + b;
        log.info("[{}]", binaryOperator.apply(2, 4));

        Comparator<Integer> c = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(c);
        log.info("[{}]", maxBi.apply(7, 8));
        BinaryOperator<Integer> minBi = BinaryOperator.minBy(c);
        log.info("[{}]", minBi.apply(7, 8));

        IntBinaryOperator intBi = (a,b) -> a * b;
        log.info("[{}]", intBi.applyAsInt(2, 4));


    }
}
