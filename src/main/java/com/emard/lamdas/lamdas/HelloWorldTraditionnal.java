package com.emard.lamdas.lamdas;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorldTraditionnal implements HelloWorldInterface {

    @Override
    public String sayHelloworld() {
        return "Hello World";
    }
    
    public static void main(String[] args) {
        HelloWorldTraditionnal hello = new HelloWorldTraditionnal();
        log.info("[{}]", hello.sayHelloworld());
    }
}
