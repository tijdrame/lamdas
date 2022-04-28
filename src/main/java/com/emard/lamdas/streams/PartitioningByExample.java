package com.emard.lamdas.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PartitioningByExample {
    public static void main(String[] args) {
        Predicate<Instructor> experiencePredicate = instructor -> instructor.getYearOfExperience() > 10;
        Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll()
                .stream().collect(Collectors.partitioningBy(experiencePredicate));
        partitionMap.forEach((key, value) -> log.info("Key = {} value = {}", key, value));
        log.info("----------------------------");
        // partition but return is set instead of list

        Map<Boolean, Set<Instructor>> partitionSet = Instructors.getAll()
                .stream().collect(Collectors.partitioningBy(experiencePredicate, Collectors.toSet()));
        partitionSet.forEach((key, value) -> log.info("Key = {} value = {}", key, value));
        log.info("----------------------------");

    }
}
