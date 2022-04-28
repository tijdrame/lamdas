package com.emard.lamdas.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConvertToZonedDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("localDateTime = {}", localDateTime);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/New_York"));
        log.info("zonedDateTime = {}", zonedDateTime);
        log.info("localDateTime.atOffset(ZoneOffset.ofHours(-10)) = {}", localDateTime.atOffset(ZoneOffset.ofHours(-10)));

    }
}
