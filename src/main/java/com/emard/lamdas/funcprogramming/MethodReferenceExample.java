package com.emard.lamdas.funcprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = instructor -> instructor.onlineCourses;
        Predicate<Instructor> p2 = Instructor::getOnlineCourses;

        Function<Integer, Double> sqrt = Math::sqrt;

        Function<String, String> lowercaseFunction1 = String::toLowerCase;
    }
}
