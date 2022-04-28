package com.emard.lamdas.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        log.info("localTime  = {}",localTime);
        localTime = LocalTime.of (15, 18);
        log.info("localTime  = {}",localTime);

        localTime = LocalTime.of(15, 18, 22);
        log.info("localTime  = {}",localTime);

        localTime = LocalTime.of(15,18,23,222222223);
        log.info("localTime  = {}",localTime);

        //get
       log.info("localTime.getHour() = {}",localTime.getHour());
       log.info("localTime.getMinute() = {}",localTime.getMinute());
       log.info("localTime.getSecond() = {}",localTime.getSecond());
       log.info("localTime.getNano() = {}",localTime.getNano());

       log.info("localTime.get(ChronoField) = {}",localTime.get(ChronoField.SECOND_OF_DAY));
       log.info("localTime.get(ChronoField) = {}",localTime.get(ChronoField.MINUTE_OF_DAY));

    }
}
