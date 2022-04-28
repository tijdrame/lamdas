package com.emard.lamdas.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GroupingByExample1 {
    public static void main(String[] args) {
        List<String> names = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length));
        log.info("result {}", result);
        log.info("----------------------------");

        Map<String, List<Instructor>> instructorByGender = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::getGender));
        instructorByGender.forEach((key, value) -> log.info("key = {} value = {}", key, value));

        log.info("----------------------------");
        Map<String, List<Instructor>> instructorsByExperience = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(i -> i.getYearOfExperience() > 10 ? "SENIOR" : "JUNIOR"));
        instructorsByExperience.forEach((key, value) -> log.info("key = {} value = {}", key, value));

    }
}
