package com.emard.lamdas.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JoiningExample {
    public static void main(String[] args) {
        String result = Stream.of("E", "F", "G", "H").collect(Collectors.joining());
        log.info("result {}", result);
        result = Stream.of("E", "F", "G", "H").collect(Collectors.joining("#"));
        log.info("result {}", result);
        result = Stream.of("E", "F", "G", "H").collect(Collectors.joining("#", "{", "}"));
        log.info("result {}", result);

        String namesConcatenated = Instructors.getAll().stream()
                            .map(Instructor::getName)
                            .collect(Collectors.joining(",","{", "}"));
        log.info("namesConcatenated {}", namesConcatenated);

    }
}
