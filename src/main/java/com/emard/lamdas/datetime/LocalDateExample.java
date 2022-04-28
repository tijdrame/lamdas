package com.emard.lamdas.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        log.info("LocalDate = {}",localDate);
        
        //using day of the year
        localDate = LocalDate.ofYearDay(2018, 35);
        log.info("LocalDate = {}",localDate);

        localDate = LocalDate.of(2018, 05, 23);
        log.info("LocalDate = {}",localDate);

        localDate = LocalDate.now();

        //Get
        log.info("localDate.getMonth = {}", localDate.getMonth());
        log.info("localDate.getMonthValue() = {}", localDate.getMonthValue());
        log.info("localDate.getDayOfWeek() = {}", localDate.getDayOfWeek());
        log.info("localDate.getDayOfYear = {}", localDate.getDayOfYear());
        log.info("localDate = {}", localDate.get(ChronoField.MONTH_OF_YEAR));
        log.info("localDate format= {}", localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
