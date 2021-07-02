package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldReturnSum() {
        assertEquals(180, service.sum(sales));
    }

    @Test
    void shouldReturnAvg() {
        assertEquals(15, service.avg(sales));
    }

    @Test
    void shouldReturnMonthNumberWithMax() {
        assertEquals(6, service.firstNumberWithMax(sales));
        assertEquals(8, service.lastNumberWithMax(sales));
    }

    @Test
    void shouldReturnMonthNumberWithMin() {
        assertEquals(9, service.NumberWithMin(sales));
    }


    @Test
    void shouldReturnCountMoreThanAvg() {
        assertEquals(5, service.moreThanAvg(sales));
    }

    @Test
    void shouldReturnCountLessThanAvg() {
        assertEquals(5, service.lessThanAvg(sales));
    }
}