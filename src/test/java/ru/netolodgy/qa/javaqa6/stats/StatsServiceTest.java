package ru.netolodgy.qa.javaqa6.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void souldAmoundSales () {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedAmound = 180;
        int actualAmound = service.amountSales(sales);

        Assertions.assertEquals(expectedAmound, actualAmound);

    }

    @Test

    public void souldMediumAmoundSales () {
        StatsService service = new StatsService();
        long[] sales =  { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMedium = 15;
        int actualMedium = service.mediumAmountSales(sales);

        Assertions.assertEquals(expectedMedium, actualMedium);
    }

    @Test

    public void shouldMinSales () {
        StatsService service = new StatsService();
        long[] sales =  { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMin = 9;
        int actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test

    public void shouldMaxSales () {
        StatsService service = new StatsService();
        long[] sales =  { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMax = 8;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void shouldSumMinMounthSales () {
        StatsService service = new StatsService();
        long[] sales =  { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMinMounth = 5;
        int actualMinMounth = service.sumMonthMinMediumSales(sales);

        Assertions.assertEquals(expectedMinMounth, actualMinMounth);
    }

    @Test
    public void shouldSumMaxMounthSales () {
        StatsService service = new StatsService();
        long[] sales =  { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMaxMounth = 5;
        int actualMaxMounth = service.maxMediumSales(sales);

        Assertions.assertEquals(expectedMaxMounth, actualMaxMounth);
    }

}
