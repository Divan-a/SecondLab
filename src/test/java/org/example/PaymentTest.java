package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {

    Payment pay1 = new Payment("Инициалы первого клиента", 1, 1, 2024, 1000);
    Payment paysetter = new Payment("Инициалы первого клиента", 1, 1, 2024, 1000);

    @Test
    public void constructorAndToStringTest(){
        assertEquals("Плательщик: Инициалы первого клиента, дата: 1.1.2024 сумма: 10 руб. 0 коп.", pay1.toString());
    }

    @Test
    public void snpGetterTest(){
        assertEquals("Инициалы первого клиента", pay1.getFullname());
    }

    @Test
    public void dayGetterTest(){
        assertEquals(1, pay1.getDay());
    }
    @Test
    public void mounthGetterTest(){
        assertEquals(1, pay1.getMounth());
    }
    @Test
    public void yearGetterTest(){
        assertEquals(2024, pay1.getYear());
    }

    @Test
    public void summGetterTest(){
        assertEquals(1000, pay1.getSumm());
    }

    @Test
    public void SetterTest(){
        paysetter.setFullname("Новые инициалы");
        paysetter.setDay(2);
        paysetter.setMounth( 2);
        paysetter.setYear(2025);
        paysetter.setSumm(2000);
        assertEquals("Плательщик: Новые инициалы, дата: 2.2.2025 сумма: 20 руб. 0 коп.", paysetter.toString());
    }

    @Test
    public void equalsTest(){
        SetterTest();
        assertEquals(false, pay1.equals(paysetter));
    }

    @Test
    public void equalsTest2(){
        assertEquals(true, pay1.equals(paysetter));
    }




}
