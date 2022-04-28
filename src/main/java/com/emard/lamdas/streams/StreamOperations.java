package com.emard.lamdas.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamOperations {
    public static void main(String[] args) {
        Long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)// on a <List<String>>
                .flatMap(List::stream) // on le transforme en List<String>
                .distinct()
                .count();
        log.info("{}", count);

        List<String> courses = Instructors.getAll().stream()
                .map(Instructor::getCourses)// on a <List<String>>
                .flatMap(List::stream) // on le transforme en List<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        log.info("{}", courses);

        Boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)// on a <List<String>>
                .flatMap(List::stream) // on le transforme en List<String>
                .anyMatch(s -> s.startsWith("J"));//allMatch tout verifie, noneMatch rien ne verifie
        log.info("match {}", match);

    }
}
