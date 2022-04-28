package com.emard.lamdas.funcprogramming;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsumerExample3 {
    
    public static void main(String[] args) {
        IntConsumer intConsumer = a -> log.info("[{}]", a * 10);
        intConsumer.accept(10);

        LongConsumer longConsumer = a -> log.info("[{}]", a * 10L);
        longConsumer.accept(10L);

        DoubleConsumer doubleConsumer = a -> log.info("[{}]", a * 10d);
        doubleConsumer.accept(10.50);
    }
}
