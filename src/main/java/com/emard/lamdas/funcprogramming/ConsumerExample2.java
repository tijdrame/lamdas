package com.emard.lamdas.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsumerExample2 {
    
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        Consumer<Instructor> c1 = s1 -> log.info("[{}]",s1);
        //instructors.forEach(System.out::println);
        instructors.forEach(c1);

        Consumer<Instructor> c2 = s1 -> log.info("[{}]",s1.getName());
        instructors.forEach(c2);

        Consumer<Instructor> c3 = s1 -> log.info("[{}]",s1.getCourses());
        instructors.forEach(c2.andThen(c3));

        log.info("----------------------");
        instructors.forEach(i -> {
            if(i.yearOfExperience > 10) c1.accept(i);
        });

        log.info("----------------------");
        instructors.forEach(i -> {
            if(i.yearOfExperience > 5 && !i.onlineCourses) c1.accept(i);
        });
    }
}
