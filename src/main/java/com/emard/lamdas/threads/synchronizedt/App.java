package com.emard.lamdas.threads.synchronizedt;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    private int count = 0;
    public synchronized void increment() {
        count ++;
    }
    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        app.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();// attend que t1 finisse
        t2.join();// attend que t2 finisse
        log.info("Count is {}", count); //synchonized garantit que le count sera tjrs 20.000
    }
}
