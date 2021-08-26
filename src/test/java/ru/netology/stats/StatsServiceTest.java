package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void monthWithMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8,15,13,15,17,20,7,14,14,18};
        int expected = 7;
        int actual = service.monthWithMinSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void monthWithMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8,15,13,15,17,20,7,14,14,18};
        int expected = 6;
        int actual = service.monthWithMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void salesSum() {
        StatsService service = new StatsService();
        int[] sales = {8,15,13,15,17,20,7,14,14,18};
        int expected = 141;
        int actual = service.salesSum(sales);
        assertEquals(expected,actual);
    }

    @Test
    void monthAverageSale() {
        StatsService service = new StatsService();
        int[] sales = {8,15,13,15,17,20,7,14,14,18};
        double expected = 14;
        int actual = service.monthAverageSale(sales);
        assertEquals(expected,actual);
    }

    @Test
    void monthAmountWithSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8,15,13,15,17,20,7,14,14,18};
        double expected = 3;
        int actual = service.monthAmountWithSalesBelowAverage(sales);
        assertEquals(expected,actual);
    }

    @Test
    void monthAmountWithSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8,15,13,15,17,20,7,14,14,18};
        double expected = 5;
        int actual = service.monthAmountWithSalesAboveAverage(sales);
        assertEquals(expected,actual);
    }
}