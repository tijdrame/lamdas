package com.emard.lamdas.funcprogramming;

import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p2 = ConvertToMethodReferenceExample::greaterThanTenYearsOfExperience;

        Instructors.getAll().forEach(instructor -> {
                if (p2.test(instructor)){
                    log.info("[{}]", instructor);

                }
        });
    }
    public static Boolean greaterThanTenYearsOfExperience(Instructor instructor) {
        return instructor.yearOfExperience > 10 ? true: false;
    }
}
