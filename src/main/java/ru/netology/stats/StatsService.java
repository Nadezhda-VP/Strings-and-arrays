package ru.netology.stats;

public class StatsService {
    public long totalAmountOfAllSales(long[] sale) { //Сумма всех продаж.
        long sum = 0;//Начальная сумма.
        for (long j : sale) {//Перебор массива.
            sum = sum + j;//Расчет общей суммы массива.
        }
        return sum;//Общая сумма от продаж.
    }

    public long averageMonthlySales(long[] sale) { //Средние месячные продажи.
        long numberOfSales = sale.length; //Количество месяцев.
        long sum = totalAmountOfAllSales(sale);//Общая сумма.
        return  sum / numberOfSales;
        //int averageSalesVolume = sum / numberOfSales;//Расчет средней продажи.
        //return averageSalesVolume;//Сумма средней продажи.
    }

    public int numberOfTheMonthWithHighSales(long[] sale) { //№ месяца с высокими продажами
        int numberMonthsMax = 0;//Номер месяца, изначально 0.
        for (int i = 0; i < sale.length; i++) {//Цикл от 0 до длинны массива.
            if (sale[i] >= sale[numberMonthsMax]) {//Проверяем если значение из массива больше или равно значению продаж
                // за текущий месяц то это и есть максимальная продажа.
                numberMonthsMax = i;//Запомним как максимальная продажа.
            }
        }
        return numberMonthsMax + 1;
    }

    public int numberOfTheMonthWithLowSales(long[] sale) { //№ месяца с низкими продажами.
        int numberMonthsMin = 0;//Номер месяца, изначально 0.
        for (int i = 0; i < sale.length; i++) {//Цикл от 0 до длинны массива.
            if (sale[i] <= sale[numberMonthsMin]) {//Проверяем если значение из массива меньше или равно значению продаж
                // за текущий месяц то это и есть минимальная продажа.
                numberMonthsMin = i;//Запомним как минимальная продажа.
            }
        }
        return numberMonthsMin + 1;
    }

    public int lowerThanAverageIncome(long[] sale) {//Количество месяцев с доходом ниже среднемесячного дохода.
        long averageSale = averageMonthlySales(sale); //Вызываем сервис среднемесячного расчета.
        int numberMonthsMin = 0;//Количество месяцев, из начально 0.
        for ( long j : sale) {//Перебор массива
            if (j < averageSale) { //Сравниваем средний доход со значением из массива,
                // если значение из массива меньше ->
                numberMonthsMin ++ ;// -> то увеличиваем количество месяцев на 1.
            }
        }
        return numberMonthsMin;
    }

    public int aboveAverageIncome(long[] sale) {//Количество месяцев с доходом выше среднемесячного дохода.
        long averageSale = averageMonthlySales(sale);//Вызываем сервис среднемесячного расчета.
        int numberMonthsMax = 0;//Количество месяцев, из начально 0.
        for (long j : sale) {//Перебор массива.
            if (j > averageSale) {//Сравниваем средний доход со значением из массива,
                // если значение из массива больше ->
                numberMonthsMax ++;// -> то увеличиваем количество месяцев на 1.
            }
        }
        return numberMonthsMax;
    }
}