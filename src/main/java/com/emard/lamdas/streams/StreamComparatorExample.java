package com.emard.lamdas.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamComparatorExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll().stream()
        .sorted(Comparator.comparing(Instructor::getName).reversed())
        .collect(Collectors.toList());
        log.info("{}", instructors);

    }
}
