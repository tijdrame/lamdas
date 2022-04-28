package com.emard.lamdas.streams;

import java.util.Random;
import java.util.stream.IntStream;

import lombok.extern.slf4j.Slf4j;

/**
 * IntStreamExample
 */
@Slf4j
public class IntStreamExample {
    public static void main(String[] args) {
        IntStream numbers = IntStream.of(1,2,3,4,5); //on peut faire le même pour DoubleStream, LongStream
        numbers.forEach(System.out::println);
        log.info("------------------");
        numbers = IntStream.iterate(0, i -> i+2).limit(10);
        numbers.forEach(System.out::println);
        log.info("------------------");
        numbers = IntStream.generate(new Random()::nextInt).limit(10);
        numbers.forEach(System.out::println);
        log.info("------------------");
        numbers = IntStream.range(1, 5);
        numbers.forEach(System.out::println);
        log.info("------------------");
        numbers = IntStream.rangeClosed(1, 5);
        numbers.forEach(System.out::println);
        log.info("------------------");

    }

}