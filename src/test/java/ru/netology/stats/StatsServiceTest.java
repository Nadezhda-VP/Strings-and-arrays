package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void totalAmountTest() {//Сумма всех продаж.
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.totalAmount(sale);
        long expected = 191;
        //long expected = 180;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void averageMonthTest() {//Средние месячные продажи.
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageMonth(sale);
        long expected = 13;
        //long expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberMaxMonthsTest() {//№ месяца с высокими продажами
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.numberMaxMonths(sale);
        int expected = 7;
        //int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberMinMonthsTest() {//№ месяца с низкими продажами.
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.numberMinMonths(sale);
        int expected = 11;
        //int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void belowAverageIncomeTest() {//Количество месяцев с доходом ниже среднемесячного дохода (13)
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowAverageIncome(sale);
        int expected = 6;
        //int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void aboveAverageIncomeTest() {//Количество месяцев с доходом выше среднемесячного дохода (13)
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.aboveAverageIncome(sale);
        int expected = 7;
        //int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

}
