package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateTotal() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateTotal(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateMiddle() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;
        int actual;
        actual = service.calculateMiddle(sales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateHighMonth() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual;
        actual = service.calculateHighMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateLowMonth() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual;
        actual = service.calculateLowMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateLowSalesMonths() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual;
        actual = service.calculateLowSalesMonths(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateHighSalesMonths() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual;
        actual = service.calculateLowSalesMonths(sales);
        assertEquals(expected, actual);
    }
}
