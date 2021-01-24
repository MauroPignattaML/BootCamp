package com.mauropignatta;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    GregorianCalendar calendar;

    public Fecha(int year, int month, int day){
        calendar = new GregorianCalendar();
        set(year, month, day);
    }

    public void set(int year, int month, int day) {
        calendar.set(year, month, day);
    }

    public void setYear(int year){
        calendar.set(Calendar.YEAR, year);
    }

    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public void setMonth(int month){
        calendar.set(Calendar.MONTH, month);
    }

    public int getMonth() {
        return calendar.get(Calendar.MONTH);
    }

    public void setDay(int day){
        calendar.set(Calendar.DATE, day);
    }

    public int getDay() {
        return calendar.get(Calendar.DATE);
    }

    @Override
    public String toString() {
        return "" + getDay() + "/" + getMonth() + "/" + getYear();
    }
}
