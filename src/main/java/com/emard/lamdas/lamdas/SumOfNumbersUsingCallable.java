package com.emard.lamdas.lamdas;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SumOfNumbersUsingCallable {
    
    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int total = IntStream.rangeClosed(0, 5000).parallel().sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < array.length/2; i++) {
                sum += array[i];
            }
            return sum;
        };
        Callable<Integer> callable2 = () -> {
            int sum = 0;
            for (int i = array.length/2; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        };
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable1, callable2);
        List<Future<Integer>> results = service.invokeAll(taskList);
        int k = 0;
        int sum = 0;
        for (Future<Integer> future : results) {
            sum += future.get();
            log.info("Sum of [{}] is [{}]", ++k, future.get());
        }
        log.info("Sum of the Callable is [{}]", sum);
        log.info("Correct sum from stream is [{}]", total);
        service.shutdown();
    }
}
