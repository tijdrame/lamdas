package com.emard.lamdas.funcprogramming;

import java.util.function.Supplier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);
        log.info("[{}]", supplier.get());
        log.info("[{}]", supplier.get());
    }
}
