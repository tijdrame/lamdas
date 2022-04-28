package com.emard.lamdas.streams;

import java.util.Random;
import java.util.stream.LongStream;

import lombok.extern.slf4j.Slf4j;

/**
 * IntStreamExample
 */
@Slf4j
public class LongStreamExample {
    public static void main(String[] args) {
        LongStream numbers = LongStream.of(1,2,3,4,5); //on peut faire le même pour DoubleStream, LongStream
        numbers.forEach(System.out::println);
        log.info("------------------");
        numbers = LongStream.iterate(0, i -> i+2).limit(5);
        numbers.forEach(System.out::println);
        log.info("------------------");
        numbers = LongStream.generate(new Random()::nextLong).limit(5);
        numbers.forEach(System.out::println);
        log.info("------------------");
        numbers = LongStream.range(1, 5);
        numbers.forEach(System.out::println);
        log.info("------------------");
        numbers = LongStream.rangeClosed(1, 5);
        numbers.forEach(System.out::println);
        log.info("------------------");

    }

}