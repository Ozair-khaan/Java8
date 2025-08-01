package com.javaEight.DateTime;

import java.time.LocalDate;

public class DateTimeEx {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate customeDate = LocalDate.of(1990, 2, 7);
        LocalDate yesterDay = today.minusDays(1);
        System.out.println(yesterDay);
        LocalDate pastMonth = today.minusMonths(1);
        System.out.println(pastMonth);
        if(today.isAfter(yesterDay)){
            System.out.println("Yes, it is true");
        }
    }
}
