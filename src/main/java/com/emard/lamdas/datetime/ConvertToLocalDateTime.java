package com.emard.lamdas.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConvertToLocalDateTime {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        log.info("localDateTime = {}", localDateTime);

        java.sql.Date dateSql = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = dateSql.toLocalDate();
        log.info("localDate = {}", localDate);

    }
}
