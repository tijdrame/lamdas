package com.emard.lamdas.threads.demo1;

import lombok.extern.slf4j.Slf4j;

public class App {
    public static void main(String[] args) {
        Runner runner1 = new Runner();
        runner1.start();

        Runner runner2 = new Runner();
        runner2.start();
    }

}

@Slf4j
class Runner extends Thread {
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