package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FinanceReportTest {

    Payment pay1 = new Payment("Инициалы первого клиента", 1, 1, 2024, 1000);
    Payment pay2 = new Payment("Инициалы второго клиента", 1, 1, 2024, 1000);
    Payment pay3 = new Payment("Инициалы третьего клиента", 1, 1, 2024, 1000);
    Payment pay4 = new Payment("Инициалы четвертого клиента", 1, 1, 2024, 1000);
    FinanceReport financeReport = new FinanceReport(new Payment[] {}, "Инициалы составителя отчета", 1, 1, 2024);

    @Test
    public void countOfPaymentsTest(){
        assertEquals(0, financeReport.getCount_of_Payment());
    }

    @Test
    public void countOfPaymensTest3(){
        FinanceReport financeReport = new FinanceReport(new Payment[] {pay1, pay2, pay3, pay4}, "Инициалы составителя отчета", 1, 1, 2024);
        assertEquals(4, financeReport.getCount_of_Payment());
    }

    @Test
    public void readTest(){
        FinanceReport financeReport = new FinanceReport(new Payment[] {pay1, pay2, pay3, pay4}, "Инициалы составителя отчета", 1, 1, 2024);
        assertEquals(pay1, financeReport.getPayment(0));
    }

    @Test
    public void toStringTest(){
        Payment pay1 = new Payment("Инициалы первого клиента", 31, 1, 2024, 1240);
        Payment pay2 = new Payment("Инициалы второго клиента", 21, 11, 2024, 1000);
        Payment pay3 = new Payment("Инициалы третьего клиента", 31, 1, 2024, 32);
        Payment pay4 = new Payment("Инициалы четвертого клиента", 11, 11, 2024, 2102302);
        FinanceReport financeReport = new FinanceReport(new Payment[] {pay1, pay2, pay3, pay4}, "Инициалы составителя отчета", 1, 1, 2024);
        System.out.println(financeReport.toString());
    }

    @Test
    public void copyTest(){
        FinanceReport financeReport = new FinanceReport(new Payment[] {pay1, pay2, pay3, pay4}, "Инициалы составителя отчета", 1, 1, 2024);
        FinanceReport newReport = new FinanceReport(financeReport);
        assertEquals(financeReport.toString(), newReport.toString());
    }

    @Test
    public void copyTest2(){
        FinanceReport financeReport = new FinanceReport(new Payment[] {pay1, pay2, pay3}, "Инициалы составителя отчета", 1, 1, 2024);
        FinanceReport newReport = new FinanceReport(financeReport);
        newReport.setPayment(pay4, 0);
        assertNotEquals(financeReport, newReport);
    }


}
