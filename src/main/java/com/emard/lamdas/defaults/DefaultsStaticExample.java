package com.emard.lamdas.defaults;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultsStaticExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike", "Syed", "Jenny", "Gene", "Rajeev");
        //Collections.sort(names);
        //log.info("names {}", names);

        names.sort(Comparator.naturalOrder());
        log.info("names {}", names);

        
    }
}
