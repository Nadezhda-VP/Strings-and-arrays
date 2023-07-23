package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void totalAmountOfAllSales(){//Сумма всех продаж.
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.totalAmountOfAllSales(sale);
        long expected = 191;
        //long expected = 180;
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void averageMonthlySales(){//Средние месячные продажи.
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageMonthlySales(sale);
        long expected = 13;
        //long expected = 15;
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void numberOfTheMonthWithHighSales() {//№ месяца с высокими продажами
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.numberOfTheMonthWithHighSales(sale);
        int expected = 7;
        //int expected = 8;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void numberOfTheMonthWithLowSales(){//№ месяца с низкими продажами.
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.numberOfTheMonthWithLowSales(sale);
        int expected = 11;
        //int expected = 9;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void lowerThanAverageIncome(){//Количество месяцев с доходом ниже среднемесячного дохода (13)
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.lowerThanAverageIncome(sale);
        int expected = 6;
        //int expected = 5;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void aboveAverageIncome(){//Количество месяцев с доходом выше среднемесячного дохода (13)
        StatsService service = new StatsService();
        long[] sale = new long[]{11, 7, 17, 6, 19, 9, 22, 15, 13, 18, 5, 17, 20, 12};
        //long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.aboveAverageIncome(sale);
        int expected = 7;
        //int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

}
