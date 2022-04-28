package com.emard.lamdas.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalDateTimeToDateAndTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("toLocalDate  = {}", localDateTime.toLocalDate());
        log.info("toLocalTime  = {}", localDateTime.toLocalTime());
        
        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        log.info("localDateTime  = {}", localDateTime);


    }
}
