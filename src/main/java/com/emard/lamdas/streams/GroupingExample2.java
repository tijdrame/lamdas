package com.emard.lamdas.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GroupingExample2 {
    public static void main(String[] args) {
        List<String> name = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result = name.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
        log.info("result {}", result);
        Map<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(i -> i.getYearOfExperience() > 10 ? "SENIOR" : "JUNIOR",
                        Collectors.filtering(s -> s.getOnlineCourses(), Collectors.toList())));
        instructorByExpAndOnline.forEach((k, v) -> log.info("Key = {} value = {}", k, v));
    }
}
