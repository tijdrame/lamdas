package com.emard.lamdas.funcprogramming;

import java.util.List;
import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PredicateExample2 {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = i -> i.onlineCourses;
        Predicate<Instructor> p2 = i -> i.yearOfExperience > 10;
        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(i -> {
            if(p1.test(i)){
                log.info("[{}]", i);
            }
        });

        instructors.forEach(i -> {
            if(p1.and(p2).test(i)){
                log.info("[{}]", i);
            }
        });

    }
}
