package com.emard.lamdas.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .forEach(System.out::println);

        log.info("Europe/London = {}", ZonedDateTime.now(ZoneId.of("Europe/London")));
        log.info("US/Pacific = {}", ZonedDateTime.now(ZoneId.of("US/Pacific")));
        log.info("America/New_York = {}", ZonedDateTime.now(ZoneId.of("America/New_York")));

    }
}
