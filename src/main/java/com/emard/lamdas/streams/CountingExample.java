package com.emard.lamdas.streams;

import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountingExample {
    public static void main(String[] args) {
        long count = Instructors.getAll().stream()
                .filter(Instructor::getOnlineCourses).count();
        log.info("count {}", count);
        count = Instructors.getAll().stream()
                .filter(Instructor::getOnlineCourses).collect(Collectors.counting());
        log.info("count {}", count);

    }
}
