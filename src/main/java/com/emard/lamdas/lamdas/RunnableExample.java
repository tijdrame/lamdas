package com.emard.lamdas.lamdas;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunnableExample {
    
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                log.info("Trad [{}]", sum);
            }
        };
        new Thread(runnable).start();

        //with lambda
        Runnable runnable2= () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            log.info("Lambdas [{}]", sum);
        };
        new Thread(runnable2).start();

        //
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            log.info("Lambdas Ter[{}]", sum);
        }).start();
    }
}
