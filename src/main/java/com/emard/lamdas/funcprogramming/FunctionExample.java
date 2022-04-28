package com.emard.lamdas.funcprogramming;

import java.util.function.Function;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        log.info("Square root of [{}] is [{}]", 64, sqrt.apply(64));

        Function<String, String> lower = s -> s.toLowerCase();
        Function<String, String> concat = s -> s.concat(" in java");
        log.info("Lower  of [{}] is [{}]", "Tidiane", lower.apply("Tidiane"));
        log.info("Lower  of [{}] is [{}]", "PROGRAMMING", lower.compose(concat).apply("PROGRAMMING"));

    }
}
