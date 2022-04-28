package com.emard.lamdas.optional;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OptionalOrElseThrowExample {
    public static void main(String[] args) {
        // orElse
        Integer[] numbers = new Integer[10];
        numbers[0] = 1;
        Optional<Integer> number = Optional.ofNullable(numbers[0]);
        int result = number.orElse(-1);
        log.info("result {}", result);

        // orElseGet
        result = number.orElseGet(() -> -1);
        log.info("result {}", result);

        // orElseThrow
        try {
            result = number.orElseThrow(Exception::new);
            log.info("result orElseThrow {}", result);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
