package com.example.myapplication.object.chapter2;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        LocalTime localTime = screening.getStartTime();
        return localTime.getDayofWeek().equals(dayOfWeek) &&
                startTime.compareTo(localTime.toLocalTime()) <= 0 &&
                endTime.compareTo(localTime.toLocalTime()) >=0;
    }
}
