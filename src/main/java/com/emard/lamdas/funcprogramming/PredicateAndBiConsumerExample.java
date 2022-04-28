package com.emard.lamdas.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class PredicateAndBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        Predicate<Instructor> p1 = i -> i.onlineCourses;
        Predicate<Instructor> p2 = i -> i.yearOfExperience > 10;
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> log.info("Name is [{}] and courses is [{}]", name, courses);
        instructors.forEach(i -> {
            if(p1.and(p2).test(i)) biConsumer.accept(i.getName(), i.courses);
        });
    }
    
    
}
