package com.emard.lamdas.optional;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OptionalOfEmptyExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hello World");
        log.info("{}", optionalString);
        log.info("getWords {}", getWords());
    }

    public static Optional<String> getWords() {
        String[] words = new String[10];
        //words[1] = "test";
        Optional<String> optionalString = Optional.ofNullable(words[1]);
        //if(optionalString.isPresent()) return optionalString;
        //return Optional.empty();
        return optionalString;
    }
}
