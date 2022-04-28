package com.emard.lamdas.funcprogramming;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = i -> i*10;
        log.info("[{}]",unary.apply(100));

        Function<Integer, Integer> f = i -> i*10;
        log.info("[{}]",f.apply(100));

        IntUnaryOperator n = i -> i*10;
        log.info("[{}]",n.applyAsInt(100));
    }
}
