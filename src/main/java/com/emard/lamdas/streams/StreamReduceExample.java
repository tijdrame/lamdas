package com.emard.lamdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int result = numbers.stream()
                .peek(System.out::println)
                .reduce(0, (a, b) -> a + b);
        log.info("result = {}", result);

        int result1 = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        log.info("result = {}", result1);

        Optional<Integer> result2 = numbers.stream()
                .reduce((a, b) -> a + b);
        log.info("result = {}", result2);

    }
}
