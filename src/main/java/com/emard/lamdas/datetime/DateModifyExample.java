package com.emard.lamdas.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateModifyExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); 
        //4 days from now
        localDate= localDate.plusDays(4);
        log.info("LocalDate plusDays = {}",localDate);
        log.info("LocalDate plusMonths 2 = {}",localDate.plusMonths(2));
        log.info("LocalDate plusYears 2 = {}",localDate.plusYears(2));
        log.info("LocalDate minusDays 10 = {}",localDate.minusDays(10));
        log.info("LocalDate withYear 2023 = {}",localDate.withYear(2023));

        log.info("LocalDate with 2025 = {}",localDate.with(ChronoField.YEAR, 2025));
        log.info("LocalDate with TemporalAdjusters 2025 = {}",localDate.with(TemporalAdjusters.lastDayOfMonth()));

    }
}
