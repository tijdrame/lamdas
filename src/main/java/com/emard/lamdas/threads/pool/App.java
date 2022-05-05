package com.emard.lamdas.threads.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            service.submit(new Processor(i));
        }

        service.shutdown();// attend la fin de tous les threads
        log.info("All tasks submited.");
        service.awaitTermination(1, TimeUnit.DAYS);
        log.info("All tasks completed.");

    }
}

/**
 * InnerApp
 */
@Slf4j
class Processor implements Runnable {
    private int id;
    public Processor(int id){
        this.id = id;
    }

    @Override
    public void run() {
        log.info("Starting id {}", id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Completed id {}", id);
    }

    
}