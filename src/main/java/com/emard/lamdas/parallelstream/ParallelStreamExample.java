package com.emard.lamdas.parallelstream;

import java.util.stream.IntStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParallelStreamExample {
    public static void main(String[] args) {
        log.info("Sum sequential: {}",sumSequentialStream());
        log.info("Sum Parallel: {}",sumParallelStream());
    }
    public static int sumSequentialStream(){
        return IntStream.rangeClosed(0,50000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(0,50000).parallel().sum();
    }
}
