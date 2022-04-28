package com.emard.lamdas.funcprogramming;

import java.util.function.BiConsumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (x,y) -> log.info("x [{}] y [{}]", x, y);
        biConsumer.accept(2, 4);
        BiConsumer<Integer, Integer> biConsumer1 = (x,y) -> log.info("x + y [{}]", x+y);
        biConsumer1.accept(2, 4);
        BiConsumer<String, String> biConsumer2 = (x,y) -> log.info("concatenete [{}]", x+y);
        biConsumer2.accept("Fell on", " deaf ears");
    }
}
