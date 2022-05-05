package com.emard.lamdas.threads.demo2;

import lombok.extern.slf4j.Slf4j;

public class App {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner());
        Thread t2 = new Thread(new Runner());

        t1.start();
        t2.start();
    }

}

@Slf4j
class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            log.info("Hello {}", i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}