package com.emard.lamdas.funcprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BiFunctionExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = i -> i.onlineCourses;

        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> mapFunction = (instructors, p) -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(it -> {
                if(p.test(it))
                    map.put(it.name, it.yearOfExperience);
            });
            return map;
        };

        log.info("[{}]", mapFunction.apply(Instructors.getAll(), p1));
    }
}
