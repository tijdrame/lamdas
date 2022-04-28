package com.emard.lamdas.funcprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionExample2 {
    public static void main(String[] args) {
        // fonction qui prend une liste et retourne un map selon un predicat
        Predicate<Instructor> p1 = i -> i.onlineCourses;

        Function<List<Instructor>, Map<String, Integer>> mapFunction = instructors -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(it -> {
                if(p1.test(it))
                    map.put(it.name, it.yearOfExperience);
            });
            return map;
        };

        log.info("[{}]", mapFunction.apply(Instructors.getAll()));
    }
}
