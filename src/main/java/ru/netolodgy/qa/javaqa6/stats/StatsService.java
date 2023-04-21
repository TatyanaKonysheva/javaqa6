package ru.netolodgy.qa.javaqa6.stats;

public class StatsService {

    public int amountSales(long[] sales) {
        int sumSailes = 0;

        for (int i = 0; i < sales.length; ++i)
            sumSailes += sales[i];
        return sumSailes;
    }

    public int mediumAmountSales(long[] sales) {
        int sumSailes = 0;

        for (int i = 0; i < sales.length; ++i)
            sumSailes += sales[i];
        int mediumAmount = sumSailes / sales.length;
        return mediumAmount;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж , больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumMonthMinMediumSales(long[] sales) {
        int sumMinMonth = 0;
        int mediumAmount = mediumAmountSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (mediumAmount > sales[i]) {
                sumMinMonth++;
            }
        }
        return sumMinMonth;

    }

    public int maxMediumSales(long[] sales) {
        int sumMaxMonth = 0;
        int mediumAmount = mediumAmountSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (mediumAmount < sales[i]) {
                sumMaxMonth++;
            }
        }
        return sumMaxMonth;
    }
}
