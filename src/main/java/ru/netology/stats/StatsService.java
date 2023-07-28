package ru.netology.stats;

public class StatsService {
    public long totalAmount(long[] sales) { //Сумма всех продаж.
        long totalSale = 0;//Начальная сумма.
        for (long sale : sales) {//Перебор массива.
            totalSale = totalSale + sale;//Расчет общей суммы массива.
        }
        return totalSale;//Общая сумма от продаж.
    }

    public long averageMonth(long[] sales) { //Средние месячные продажи.
        //long numberOfSales = sales.length; //Количество месяцев.
        //long sum = totalAmountOfAllSales(sales);//Общая сумма.
        return totalAmount(sales) / sales.length;
        //int averageSalesVolume = sum / numberOfSales;//Расчет средней продажи.
        //return averageSalesVolume;//Сумма средней продажи.
    }

    public int numberMaxMonths(long[] sales) { //№ месяца с высокими продажами
        int numberMonths = 0;//Номер месяца, изначально 0.
        for (int i = 0; i < sales.length; i++) {//Цикл от 0 до длинны массива.
            if (sales[i] >= sales[numberMonths]) {//Проверяем если значение из массива больше или равно значению продаж
                // за текущий месяц то это и есть максимальная продажа.
                numberMonths = i;//Запомним как максимальная продажа.
            }
        }
        return numberMonths + 1;
    }

    public int numberMinMonths(long[] sales) { //№ месяца с низкими продажами.
        int numberMonths = 0;//Номер месяца, изначально 0.
        for (int i = 0; i < sales.length; i++) {//Цикл от 0 до длинны массива.
            if (sales[i] <= sales[numberMonths]) {//Проверяем если значение из массива меньше или равно значению продаж
                // за текущий месяц то это и есть минимальная продажа.
                numberMonths = i;//Запомним как минимальная продажа.
            }
        }
        return numberMonths + 1;
    }

    public int belowAverageIncome(long[] sales) {//Количество месяцев с доходом ниже среднемесячного дохода.
        long averageSale = averageMonth(sales); //Вызываем сервис среднемесячного расчета.
        int numberMonths = 0;//Количество месяцев, из начально 0.
        for (long sale : sales) {//Перебор массива
            if (sale < averageSale) { //Сравниваем средний доход со значением из массива,
                // если значение из массива меньше ->
                numberMonths++;// -> то увеличиваем количество месяцев на 1.
            }
        }
        return numberMonths;
    }

    public int aboveAverageIncome(long[] sales) {//Количество месяцев с доходом выше среднемесячного дохода.
        long averageSale = averageMonth(sales);//Вызываем сервис среднемесячного расчета.
        int numberMonths = 0;//Количество месяцев, из начально 0.
        for (long sale : sales) {//Перебор массива.
            if (sale > averageSale) {//Сравниваем средний доход со значением из массива,
                // если значение из массива больше ->
                numberMonths++;// -> то увеличиваем количество месяцев на 1.
            }
        }
        return numberMonths;
    }
}