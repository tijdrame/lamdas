package com.emard.lamdas.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("localDateTime  = {}", localDateTime);

        localDateTime = LocalDateTime.of(2022, 1, 12, 12, 12, 12);
        log.info("localDateTime  = {}", localDateTime);

        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        log.info("localDateTime  = {}", localDateTime);

        // get
        log.info("localDateTime.getHour() = {}", localDateTime.getHour());
        log.info("localDateTime.getMonth() = {}", localDateTime.getMonth());
        log.info("localDateTime.getMinute() = {}", localDateTime.getMinute());
        log.info("localDateTime.getSecond() = {}", localDateTime.getSecond());
        log.info("localDateTime.get(MONTH_OF_YEAR) = {}", localDateTime.get(ChronoField.MONTH_OF_YEAR));

        // Modify
        log.info("localDateTime.plusYears(3) = {}", localDateTime.plusYears(3));
        log.info("localDateTime.plusHours(4) = {}", localDateTime.plusHours(4));
        log.info("localDateTime.plusMinutes(60) = {}", localDateTime.plusMinutes(60));
        log.info("localDateTime.with(ChronoField) = {}", localDateTime.with(ChronoField.HOUR_OF_DAY, 3));
        log.info("localDateTime.with(LocalTime) = {}", localDateTime.with(LocalTime.MIDNIGHT));

    }
}
