package com.emard.lamdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamLimitAndSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> limit5 = numbers.stream().limit(5).collect(Collectors.toList());
        limit5.forEach(System.out::println);
        List<Integer> skip5 = numbers.stream().skip(5).collect(Collectors.toList());
        skip5.forEach(System.out::println);

    }
}
