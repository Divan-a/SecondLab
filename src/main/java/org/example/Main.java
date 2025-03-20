package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Payment pay1 = new Payment("Инициалы первого клиента", 1, 1, 2024, 1000);
        Payment pay2 = new Payment("Инициалы второго клиента", 1, 1, 2024, 2000);
        Payment pay3 = new Payment("Инициалы третьего клиента", 1, 1, 2024, 3000);
        Payment pay4 = new Payment("Инициалы четвертого клиента", 1, 1, 2024, 4000);
        FinanceReport financeReport = new FinanceReport(new Payment[] {pay1, pay2, pay3}, "Инициалы составителя отчета", 1, 1, 2024);

    }
}