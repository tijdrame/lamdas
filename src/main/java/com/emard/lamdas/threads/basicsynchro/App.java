package com.emard.lamdas.threads.basicsynchro;

import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;

/**
 * App
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        Processor proc1 = new Processor();
        proc1.start();

        log.info("Press enter to terminate");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        proc1.shutdown();
    }

}

@Slf4j
class Processor extends Thread {
    //volatile met la var dans la memoire partagée par les threads
    public volatile boolean running = true;
    public void run() {
        while (running) {
            log.info("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;

    }
}