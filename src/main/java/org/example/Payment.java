package org.example;

import java.util.Objects;

public class Payment {
    private String fullname;
    private int day;
    private int mounth;
    private int year;
    private int summ;

    public Payment(String fullname, int day, int mounth, int year, int summ){
        this.fullname = fullname;
        this.day = day;
        this.mounth = mounth;
        this.year = year;
        this.summ = summ;
    }



    public String getFullname() {
        return fullname;
    }

    public int getDay() {
        return day;
    }

    public int getMounth() {
        return mounth;
    }

    public int getYear() {
        return year;
    }

    public int getSumm() {
        return summ;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day == payment.day && mounth == payment.mounth && year == payment.year && summ == payment.summ && Objects.equals(fullname, payment.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, day, mounth, year, summ);
    }

    @Override
    public String toString() {
        return String.format("\tПлательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.", fullname, day, mounth, year, summ /100, summ %100);
    }
}
