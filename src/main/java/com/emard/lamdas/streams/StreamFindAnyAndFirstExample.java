package com.emard.lamdas.streams;

import java.util.Optional;

import com.emard.lamdas.funcprogramming.Instructor;
import com.emard.lamdas.funcprogramming.Instructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamFindAnyAndFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> iOptional = Instructors.getAll()
        .stream()
        .findAny();
        log.info("result = {}", iOptional);

        iOptional = Instructors.getAll()
        .stream()
        .findFirst();
        log.info("result = {}", iOptional);

    }
}
