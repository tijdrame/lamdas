package com.emard.lamdas.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamPerformanceExample {
    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerformance(StreamPerformanceExample::sumSequentialStream,loop);
        log.info("Time Taken to process sum in sequential: {} in msecs", result);
        result = measurePerformance(StreamPerformanceExample::sumParallelStream,loop);
        log.info("Time Taken to process sum in Parallel: {} in msecs", result);

    }

    public static long measurePerformance (Supplier<Integer> supplier, int numberOfTimes){
        long startTime= System.currentTimeMillis();
        for (int i=0;i<numberOfTimes;i++)
            supplier.get();
        return System.currentTimeMillis() - startTime;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(0,50000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(0,50000).parallel().sum();
    }
}
