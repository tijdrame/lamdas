package com.emard.lamdas.funcprogramming;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory factory = Instructor::new;
        Instructor instructor = factory.getInstructor("Mike", 10, "Software Developer"
        , "M", true, Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
        log.info("{}", instructor);

    }
}
