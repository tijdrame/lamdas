package com.emard.lamdas.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CollectorsMinMaxExample {
    public static void main(String[] args) {
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(
                        Instructor::getYearOfExperience)));
        log.info("instructor {}", instructor);
        log.info("----------------------------");
        instructor = Instructors.getAll().stream()
        .min(Comparator.comparing(Instructor::getYearOfExperience));
        log.info("instructor {}", instructor);
        log.info("----------------------------");

        instructor = Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(
                        Instructor::getYearOfExperience)));
        log.info("instructor {}", instructor);
        log.info("----------------------------");
        instructor = Instructors.getAll().stream()
        .max(Comparator.comparing(Instructor::getYearOfExperience));
        log.info("instructor {}", instructor);
        log.info("----------------------------");
    }
}
