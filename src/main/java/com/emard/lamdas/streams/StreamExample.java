package com.emard.lamdas.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = i -> i.getOnlineCourses();
        Predicate<Instructor> p2 = i -> i.getYearOfExperience() > 10;

        List<Instructor> list = Instructors.getAll();
        Map<String, List<String>> map = list.stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
        log.info("{}", map);
    }

}
