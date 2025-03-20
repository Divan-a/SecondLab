package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinanceReportProcessor {
    public static FinanceReport search_by_letter(FinanceReport report, char character) {
        List<Payment> payments = new ArrayList<>();
        for (int i = 0; i < report.getCount_of_Payment(); i++) {
            if (report.getPayment(i).getFullname().charAt(0) == character) {
                payments.add(report.getPayment(i));
            }
        }
        return new FinanceReport(payments.toArray(Payment[]::new), "null", 13, 13, 13);
    }

    public static FinanceReport search_less_than_value(FinanceReport report, int value) {
        List<Payment> payments = new ArrayList<>();
         for (int i = 0; i < report.getCount_of_Payment(); i++) {
            if (report.getPayment(i).getSumm() < value) {
                payments.add(report.getPayment(i));
            }
        }
        return new FinanceReport(payments.toArray(Payment[]::new), "null", 13, 13, 13);
    }
}