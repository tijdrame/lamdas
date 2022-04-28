package com.emard.lamdas.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        BiPredicate<Boolean, Integer> p3 = (online, experience) -> online && experience > 10;

        BiConsumer<String, List<String>> biConsumer = (name, courses) ->
                log.info("Name is [{}] and courses is [{}]", name, courses);
                
        instructors.forEach(i -> {
            if(p3.test(i.onlineCourses, i.getYearOfExperience()))
                biConsumer.accept(i.getName(), i.getCourses());
        });
    }
}
