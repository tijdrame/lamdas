package com.emard.lamdas.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlatMapExample {
    public static void main(String[] args) {
        Set<String> instructorCourses = Instructors.getAll().stream()
                .map(Instructor::getCourses)//on a <List<String>>
                .flatMap(List::stream) // on le transforme en List<String>
                .collect(Collectors.toSet());
        log.info("{}", instructorCourses);

    }
}
