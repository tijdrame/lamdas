package com.emard.lamdas.streams;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        Integer result = Instructors.getAll()
                .stream()
                .filter(Instructor::getOnlineCourses)
                .map(Instructor::getYearOfExperience)
                //.reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
        log.info("result = {}", result);

    }
}
