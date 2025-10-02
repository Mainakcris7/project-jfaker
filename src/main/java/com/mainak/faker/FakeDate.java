package com.mainak.faker;

import java.time.LocalDate;
import java.time.LocalTime;

public class FakeDate {
    // Function to generate a random date between two dates
    public LocalDate between(LocalDate start, LocalDate end) {
        if (start.isAfter(end)) {
            int year = start.getYear() + 10; // If start is after end, extend the end date by 10 years from start date
            end = LocalDate.of(year, end.getMonth(), end.getDayOfMonth());
        }
        long days = end.toEpochDay() - start.toEpochDay();
        long randomDay = start.toEpochDay() + (long) (Math.random() * days);
        return LocalDate.ofEpochDay(randomDay);
    }

    // Function to generate a random past date within the last 'n' days
    public LocalDate past(int days) {
        if (days <= 0) {
            days = 365; // Default to last year
        }
        LocalDate end = LocalDate.now();
        LocalDate start = end.minusDays(days);
        return between(start, end);
    }

    // Function to generate a random future date within the given 'n' days
    public LocalDate future(int days) {
        if (days <= 0) {
            days = 365; // Default to next year
        }
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(days);
        return between(start, end);
    }

    // Function to generate random time
    public LocalTime time() {
        int hour = (int) (Math.random() * 24);
        int minute = (int) (Math.random() * 60);
        int second = (int) (Math.random() * 60);
        return LocalTime.of(hour, minute, second);
    }
}
