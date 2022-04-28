package com.emard.lamdas.streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(0, 1000).sum();
        log.info("sum = {}", sum);

        OptionalInt min = IntStream.rangeClosed(0, 1000).min();
        log.info("min = {}", min);

        OptionalInt max = IntStream.rangeClosed(0, 1000).max();
        log.info("max = {}", max);

        OptionalDouble avg = LongStream.rangeClosed(0, 1000).asDoubleStream().average();
        log.info("avg = {}", avg);

    }
}
