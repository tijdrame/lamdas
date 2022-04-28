package com.emard.lamdas.funcprogramming;

import java.util.function.Consumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsummerExample {
    
    public static void main(String[] args) {
        Consumer<String> c = x -> log.info("[{}], the value of x: [{}]", x.length(), x);
        c.accept("Up in the air");

        //Consumer with block statement
        Consumer<Integer> d = x -> {
            log.info("x*x = [{}]", x*x);
            log.info("x/x = [{}]", x/x);
        };
        d.accept(10);
    }
}
