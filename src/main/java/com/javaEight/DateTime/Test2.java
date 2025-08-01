package com.javaEight.DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        ZonedDateTime indiaTime = ZonedDateTime.now();
        System.out.println("Asia date time :: " +indiaTime);
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New york time :: "+newYorkTime);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);
    }
}
