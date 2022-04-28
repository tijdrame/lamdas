package com.emard.lamdas.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        List<Integer> numbers;

        IntStream numStream = IntStream.rangeClosed(0, 5000);
        numbers = numStream.boxed().collect(Collectors.toList());
        numbers.forEach(System.out::println);
        log.info("----------------------------");
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        log.info("sum = {}", sum);
        //int sum1 = numbers.stream().mapToInt(i -> i).sum();
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        log.info("sum1 = {}", sum1);


    }

}
