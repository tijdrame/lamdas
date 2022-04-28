package com.emard.lamdas.streams;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GroupingMinMaxAvgExample {
    public static void main(String[] args) {
        Map<Boolean, Optional<Instructor>> maxInstructors = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::getOnlineCourses,
                        Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExperience))));
        maxInstructors.forEach((key, value) -> log.info("Key = {} value = {}", key, value));
        log.info("----------------------------");

        Map<Boolean, Instructor> maxInstructors1 = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::getOnlineCourses,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExperience)),
                                Optional::get)));
        maxInstructors1.forEach((key, value) -> log.info("Key = {} value = {}", key, value));
        log.info("----------------------------");

        Map<Boolean, Double> maxInstructors2 = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::getOnlineCourses,
                        Collectors.averagingInt(Instructor::getYearOfExperience)));
        maxInstructors2.forEach((key, value) -> log.info("Key = {} value = {}", key, value));

        log.info("----------------------------");
        //drive a statistical summary from properties of grouped items
        Map<Boolean, IntSummaryStatistics> maxInstructors3 = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::getOnlineCourses,
                        Collectors.summarizingInt(
                                Instructor::getYearOfExperience)
                ));
        maxInstructors3.forEach((key, value) -> log.info("Key = {} value = {}", key, value));

    }
}
