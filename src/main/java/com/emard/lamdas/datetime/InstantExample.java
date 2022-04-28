package com.emard.lamdas.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InstantExample {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        log.info("timestamp = {}", timestamp);
        log.info("timestamp.getNano() = {}", timestamp.getNano());
        
        Instant timestamp1 = Instant.now().plusSeconds(3600); 
        Duration duration = Duration.between(timestamp1,timestamp);
        log.info("duration.toSeconds() = {}", duration.toSeconds());

        LocalDateTime ld = LocalDateTime.ofInstant(timestamp1, ZoneId.of(ZoneId.SHORT_IDS.get("EST")));
        log.info("ld = {}", ld);

    }
}
