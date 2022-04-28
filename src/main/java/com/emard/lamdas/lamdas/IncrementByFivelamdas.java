package com.emard.lamdas.lamdas;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IncrementByFivelamdas {
    public static void main(String[] args) {
        IncrementByFiveInterface interface1 =  x ->  x + 5;
        log.info("[{}]", interface1.incrementByFive(2));
    }
    

}
