package com.emard.lamdas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamVsCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        log.info("{}", names);
        names.remove("Syed");
        log.info("{}", names);
        
        Stream<String> nameStream = names.stream();

    }
}
