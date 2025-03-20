package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinanceReportProcessorTest {
    @Test
    public void search_by_letterTest(){
        Payment pay1 = new Payment("Инициалы первого клиента", 1, 1, 2024, 1000);
        Payment pay2 = new Payment("Инициалы второго клиента", 1, 1, 2024, 2000);
        Payment pay3 = new Payment("Инициалы третьего клиента", 1, 1, 2024, 3000);
        Payment pay4 = new Payment("Инициалы четвертого клиента", 1, 1, 2024, 4000);
        FinanceReport financeReport = new FinanceReport(new Payment[] {pay1, pay2, pay3, pay4}, "Инициалы составителя отчета", 1, 1, 2024);


        assertEquals(4, FinanceReportProcessor.search_by_letter(financeReport, 'И').getCount_of_Payment());
    }

    @Test
    public void search_less_than_valueTest(){
        Payment pay1 = new Payment("Инициалы первого клиента", 1, 1, 2024, 1000);
        Payment pay2 = new Payment("Инициалы второго клиента", 1, 1, 2024, 2000);
        Payment pay3 = new Payment("Инициалы третьего клиента", 1, 1, 2024, 3000);
        Payment pay4 = new Payment("Инициалы четвертого клиента", 1, 1, 2024, 4000);
        FinanceReport financeReport = new FinanceReport(new Payment[] {pay1, pay2, pay3, pay4}, "Инициалы составителя отчета", 1, 1, 2024);

        assertEquals(2, FinanceReportProcessor.search_less_than_value(financeReport, 2500).getCount_of_Payment());
    }




}
