package com.emard.lamdas.funcprogramming;

import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i>10;
        log.info("[{}]", p1.test(100));

        Predicate<Integer> p2 = i -> i % 2 == 0;
        log.info("[{}]", p1.and(p2).test(100));

        log.info("[{}]", p1.or(p2).test(8));

        log.info("[{}]", p1.and(p2.negate()).test(33));
    }
}
