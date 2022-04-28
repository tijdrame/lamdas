package com.emard.lamdas.streams;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MapToObjLongDoubleExample {
    public static void main(String[] args) {
        List<RandomIds> randomIds = IntStream.rangeClosed(0,5)
        .mapToObj(i -> new RandomIds(i, ThreadLocalRandom.current().nextInt(100))
        ).collect(Collectors.toList());
        randomIds.forEach(System.out::println);
        log.info("----------------------------");
        LongStream longStream = IntStream.rangeClosed(0,5).mapToLong(i -> (long)i);
        longStream.forEach(System.out::println);
        log.info("----------------------------");
        DoubleStream doubleStream = LongStream.rangeClosed(0,5).mapToDouble(i -> i);
        doubleStream.forEach(System.out::println);
    }
}
@Data
@AllArgsConstructor
class RandomIds{
    int id;
    int randomNumbers;
}