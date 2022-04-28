package com.emard.lamdas.parallelstream;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class StreamPerformanceExample1 {

    private static long tokenCount = 50000;

    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerf(StreamPerformanceExample1::sortSequentialTream, loop);
        log.info("Sequential = {}", result);
        result = measurePerf(StreamPerformanceExample1::sortParallellTream, loop);
        log.info("Parallel = {}", result);
    }

    public static long measurePerf(Supplier<Long> supplier, int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }
    public static long sortSequentialTream() {
        List<RandomTokens> randomTokens = LongStream.range(0, tokenCount).parallel()
                .mapToObj(i -> new RandomTokens(i, ThreadLocalRandom.current().nextLong(tokenCount)))
                .collect(Collectors.toList());
        randomTokens.stream().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;
    }

    public static long sortParallellTream() {
        List<RandomTokens> randomTokens = LongStream.range(0, tokenCount).parallel()
                .mapToObj(i -> new RandomTokens(i, ThreadLocalRandom.current().nextLong(tokenCount)))
                .collect(Collectors.toList());
        //randomTokens.parallelStream().sorted(Comparator.comparing(RandomTokens::getTokens));
        randomTokens.stream().parallel().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;
    }
}

/**
 * InnerStreamPerformanceExample1
 */
@Data
@AllArgsConstructor
class RandomTokens {
    private long id;
    private long tokens;

}