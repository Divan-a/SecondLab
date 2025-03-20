package org.example;


import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private Payment[] payments;
    private String author;
    private int day;
    private int month;
    private int year;

    public FinanceReport(Payment[] payments, String author, int day, int month, int year) {
        this.payments = payments;
        this.author = author;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public FinanceReport(FinanceReport financeReport) {
        author = financeReport.getAuthor();
        day = financeReport.getDay();
        month = financeReport.getMonth();
        year = financeReport.getYear();
        payments = new Payment[financeReport.getCount_of_Payment()];
        for (int i = 0; i < financeReport.getCount_of_Payment(); ++i) {
            payments[i] = new Payment(
                    financeReport.getPayment(i).getFullname(),
                    financeReport.getPayment(i).getDay(),
                    financeReport.getPayment(i).getMounth(),
                    financeReport.getPayment(i).getYear(),
                    financeReport.getPayment(i).getSumm());
        }

    }

    public FinanceReport() {
        this.payments = new Payment[]{};
        author = "null";
        day = 1;
        month = 1;
        year = 1;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public void setPayments(Payment[] payments) {
        this.payments = payments;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCount_of_Payment() {
        return payments.length;
    }

    public Payment getPayment(int i) {
        return payments[i];
    }

    public void setPayment(Payment pay, int i) {
        if(i > payments.length || i < 0){
            throw new IllegalArgumentException("выход за границы массива");
        }
        payments[i] = pay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return day == that.day && month == that.month && year == that.year && Objects.deepEquals(payments, that.payments) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(payments), author, day, month, year);
    }

    @Override
    public String toString() {
        StringBuilder pays = new StringBuilder();
        for (Payment payment : payments) {
            if (payment == null) break;
            pays.append(payment).append(System.lineSeparator());
        }
        return String.format("[Автор: %s, дата: " + day + "." + month + "." + year +
                        ", Платежи: [\n%s]]",
                author, pays);
    }
}
