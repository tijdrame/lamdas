package com.emard.lamdas.streams;

import java.util.Random;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamFactoryMethodExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        stream.forEach(System.out::println);
        log.info("------------------");
        Stream<Integer> stream1 = Stream.iterate(0, i-> i+2).limit(10);
        stream1.forEach(System.out::println);
        log.info("------------------");
        Stream<Integer> stream2 = Stream.generate(new Random()::nextInt).limit(10);
        stream2.forEach(System.out::println);


    }
}
