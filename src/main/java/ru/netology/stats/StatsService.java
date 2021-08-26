package ru.netology.stats;

public class StatsService {

    public int salesSum(int[] sales) {
        int salesSum = 0;
        for (long sale : sales) {
            salesSum += sale;
        }
        return salesSum;
    }

    public int monthAverageSale(int[] sales) {
        int sum;
        sum = salesSum(sales);
        return sum / sales.length;
    }

    /* пример из ДЗ
        public int monthWithMaxSales(int[] sales) {
            int maxMonth = 0; //Создаем новую переменную для хранения макс результата и присваеваем ей ноль
            int month = 0;
            for (long sale : sales) {
                if (sale >= sales[maxMonth]) { //Проходим по массиву, сравнивая значение в каждой ячейки, начиная с нулевой, со значением для хранения макс результата
                    maxMonth = month; // Если больше, то значение из ячейки массива сохраяется в переменную
                }
                month = month + 1; // После завершения цикла возвращаем переменную, прибавляя единицу, чтобы узнать фактичексий номер месяца
            }
            return maxMonth + 1;
        }
    */

    public int monthWithMaxSales(int[] sales) {
        int monthWithMaxSalesNumber = 0; //Создаем новую переменную для хранения номера месяца с макс результатом и присваеваем ей ноль
        long monthWithMaxSalesValue = 0; //Создаем новую переменную для хранения значений в месяце с макс результатом и присваеваем ей ноль
        int currentMonthNumber = 0;
        for (long sale : sales) {
            if (sale >= monthWithMaxSalesValue) { //Проходим по массиву, сравнивая значение в каждой ячейки, начиная с нулевой, со значением для хранения макс результата
                monthWithMaxSalesValue = sale; // Если больше, то значение из ячейки массива сохраяется в переменную
                monthWithMaxSalesNumber = currentMonthNumber;
            }
            currentMonthNumber = currentMonthNumber + 1; // После завершения цикла возвращаем переменную, прибавляя единицу, чтобы узнать фактичексий номер месяца
        }
        return monthWithMaxSalesNumber + 1;
    }

    public int monthWithMinSales(int[] sales) {
        int monthWithMinSalesNumber = 0;
        long monthWithMinSalesValue = sales[0];
        int currentMonthNumber = 0;
        for (long sale : sales) {
            if (sale <= monthWithMinSalesValue) {
                monthWithMinSalesValue = sale;
                monthWithMinSalesNumber = currentMonthNumber;
            }
            currentMonthNumber = currentMonthNumber + 1;
        }
        return monthWithMinSalesNumber + 1;
    }

    public int monthAmountWithSalesBelowAverage(int[] sales) {
        long averageSalesPerMonth = monthAverageSale(sales);
        int amountMonth = 0;
        for (long sale : sales) {
            if (sale < averageSalesPerMonth)
                amountMonth = amountMonth + 1;
        }

        return amountMonth;
    }

    public int monthAmountWithSalesAboveAverage(int[] sales) {
        long averageSalesPerMonth = monthAverageSale(sales);
        int amountMonth = 0;
        for (long sale : sales) {
            if (sale > averageSalesPerMonth)
                amountMonth = amountMonth + 1;
        }

        return amountMonth;
    }
}