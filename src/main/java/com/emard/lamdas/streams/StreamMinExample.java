package com.emard.lamdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        Optional<Integer> result = numbers.stream().min(Integer::compareTo);
        log.info("result = {}", result);

        Optional<Integer> result1 = numbers.stream().reduce((a, b) -> a < b ? a : b);
        log.info("result = {}", result1);

        Optional<Integer> result2 = numbers.stream().reduce(Integer::min);
        log.info("result = {}", result2);

    }
}
