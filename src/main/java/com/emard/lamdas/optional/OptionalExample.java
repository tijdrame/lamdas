package com.emard.lamdas.optional;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OptionalExample {
    public static void main(String[] args) {
        // Integer[] numbers = new Integer[10];
        // int number = numbers[1].intValue();
        // System.out.println("number = " + number);

        Integer[] numbers = new Integer[10];
        Optional<Integer> number = Optional.ofNullable(numbers[1]);
        log.info("{}", number);
    }
}
