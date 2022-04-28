package com.emard.lamdas.streams;

import java.util.List;
import java.util.Optional;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamReduceExample2 {
    public static void main(String[] args) {
        Optional<Instructor> opt = Instructors.getAll()
        .stream()
        .reduce((a, b) -> a.getYearOfExperience() > b.getYearOfExperience() ? a : b);
        /*.reduce((a, b) -> {
            if(a.getYearOfExperience() > b.getYearOfExperience()) return a;
            return b;
        });*/
        log.info("opt = {}", opt);
        
    }
}
