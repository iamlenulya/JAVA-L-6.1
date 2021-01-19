package ru.netology.stats;

public class StatsService {

    public int calculateTotal(int[] sales) {
        int total = 0;
        for (int value : sales) {
            total += value;
        }
        return total;
    }

    public int calculateMiddle(int[] sales) {
        int months = sales.length;
        int total = calculateTotal(sales);
        int middle = 0;
        middle = total / months;

        return middle;
    }

    public int calculateHighMonth(int[] sales) {
        int max = sales[0];
        int month = 0;
        int maxMonth = 0;
        for (int value : sales) {
            month++;
            if (max <= value) {
                max = value;
                maxMonth = month;
            }
        }

        return maxMonth;
    }

    public int calculateLowMonth(int[] sales) {
        int min = sales[0];
        int month = 0;
        int maxMonth = 0;
        for (int value : sales) {
            month++;
            if (min >= value) {
                min = value;
                maxMonth = month;
            }
        }

        return maxMonth;
    }

    public int calculateLowSalesMonths(int[] sales) {
        int lowMonthsCount = 0;
        int middle = calculateMiddle(sales);

        for (int value : sales) {
            if (middle < value) {
                lowMonthsCount++;
            }
        }
        return lowMonthsCount;
    }

    public int calculateHighSalesMonths(int[] sales) {
        int highMonthsCount = 0;
        int middle = calculateMiddle(sales);

        for (int value : sales) {
            if (middle > value) {
                highMonthsCount++;
            }
        }
        return highMonthsCount;
    }
}