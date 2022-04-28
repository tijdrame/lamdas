package com.emard.lamdas.lamdas;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcateneteLamdas {
    public static void main(String[] args) {
        ConcateneteInterface interface1 = (a, b) -> a +" "+ b;
        log.info("[{}]",  interface1.sconcat("TIDIANE", "DRAME"));
    }
}
