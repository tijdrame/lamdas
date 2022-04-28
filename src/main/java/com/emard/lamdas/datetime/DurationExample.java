package com.emard.lamdas.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().plusHours(2);
        Duration duration = Duration.between(localDateTime, localDateTime1);
        log.info("duration.toHours()  = {}", duration.toHours());

        duration = Duration.ofHours(3);
        log.info("duration.toMinutes()  = {}", duration.toMinutes());

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now().plusMinutes(60);
        duration = Duration.between(localTime, localTime1);
        log.info("duration.toMinutes()  = {}", duration.toMinutes());

        //duration ne marche pas avec localDate
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(1);
        duration = Duration.between(localDate, localDate1);
        log.info("duration.toMinutes()  = {}", duration);

    }
}
