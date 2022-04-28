package com.emard.lamdas.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateTimeExample {
    public static void main(String[] args) {
        Date dateObj = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        log.info("df.format(dateObj) = {}", df.format(dateObj));

        df = new SimpleDateFormat("HH:mm:ss");
        log.info("df.format(dateObj) = {}", df.format(dateObj));

        log.info("Calendar = {}",Calendar.getInstance().getTime());

        //LocalDate
        LocalDate localDate = LocalDate.now();
        log.info("LocalDate = {}",localDate);
        //LocalTime
        LocalTime localTime = LocalTime.now();
        log.info("LocalTime = {}",localTime);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("LocalDateTime = {}",localDateTime);


    }
}
