package com.emard.lamdas.lamdas;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IncrementByFiveTraditional implements IncrementByFiveInterface {

    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional traditional = new IncrementByFiveTraditional();
        log.info("[{}]",traditional.incrementByFive(2));
    }
    
}
