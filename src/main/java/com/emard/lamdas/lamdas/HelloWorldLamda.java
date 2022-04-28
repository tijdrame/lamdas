package com.emard.lamdas.lamdas;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorldLamda {
    public static void main(String[] args) {
        HelloWorldInterface interface1 = () -> "Hello WOrld!";
        log.info("[{}]", interface1.sayHelloworld());
    }

}
