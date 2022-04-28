package com.emard.lamdas.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalTimeModifyExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        
        log.info("localTime.plusHours(2) = {}", localTime.plusHours(2));
        log.info("localTime.plusMinutes(22) = {}", localTime.plusMinutes(22));
        log.info("localTime.plusSeconds(30) = {}", localTime.plusSeconds(30));
        log.info("localTime.plusNanos(22222) = {}", localTime.plusNanos(22222));
        log.info("localTime.minusHours(2) = {}", localTime.minusHours(2));
        log.info("localTime.minus(ChroUnit.) = {}", localTime.minus(2, ChronoUnit.HOURS));

        log.info("localTime.with(LocalTime.MIDNIGHT) = {}", localTime.with(LocalTime.MIDNIGHT));
        log.info("localTime.with(ChronoField) = {}", localTime.with(ChronoField.HOUR_OF_DAY, 4));

    }
}
