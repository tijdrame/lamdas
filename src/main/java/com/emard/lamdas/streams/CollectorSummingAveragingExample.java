package com.emard.lamdas.streams;

import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CollectorSummingAveragingExample {
    public static void main(String[] args) {
        int sum = Instructors.getAll().stream()
        .collect(Collectors.summingInt(Instructor::getYearOfExperience));
        log.info("sum {}", sum);
        double average = Instructors.getAll().stream()
        .collect(Collectors.averagingInt(Instructor::getYearOfExperience));
        log.info("average {}", average);

    }
}
