package com.emard.lamdas.optional;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OptionalIfIsExample {
    public static void main(String[] args) {
        //isPresent
        Optional<String> stringOptional = Optional.ofNullable("Hello World");
        
        if(stringOptional.isPresent()) log.info("result {}", stringOptional);
        
        stringOptional.ifPresent(s -> log.info("result {}", stringOptional));
    }
}
