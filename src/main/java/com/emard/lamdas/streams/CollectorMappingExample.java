package com.emard.lamdas.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CollectorMappingExample {
    public static void main(String[] args) {
        // map
        List<String> namesList = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        namesList.forEach(System.out::println);
        log.info("----------------------------");

        // mapping
        namesList = Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));

        namesList.forEach(System.out::println);
        log.info("----------------------------");
        Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));
        mapYearsOfExperienceAndNames.forEach((key, value) -> {
            log.info("key = {} value = {}", key, value);
        });
    }
}
