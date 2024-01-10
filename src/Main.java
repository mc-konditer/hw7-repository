import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int total = 2459000;
        int deposit = 15000;
        double sum = 0;
        int month = 1;
        double percent = 0.01;
        while (sum < total) {
            sum = (1 + percent) * sum;
            sum = sum + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей.");
            month++;
        }

        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12000000;
        int fertility = 17;
        int mortality = 8;
        int startYear = 2023;
        for (int year = startYear; year < startYear + 10; year++) {
            population = population + fertility * population / 1000 - mortality * population / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println("Задача 4");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        total = 12000000;
        sum = 15000;
        percent = 0.07;
        month = 1;
        while (sum < total) {
            sum = sum + percent * sum;
            System.out.printf("Месяц %d, сумма накоплений равна %s%n", month, numberFormat.format(sum));
            month++;
        }

        System.out.println("Задача 5");
        sum = 15000;
        month = 1;
        while (sum < total) {
            sum = sum + percent * sum;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %s%n", month, numberFormat.format(sum));
            }
            month++;
        }

        System.out.println("Задача 6");
        sum = 15000;
        month = 1;
        int months = 12 * 9;
        while (month <= months) {
            sum = sum + percent * sum;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %s%n", month, numberFormat.format(sum));
            }
            month++;
        }

        System.out.println("Задача 7");
        int firstFreedayAtTheMonth = 3;
        for (int day = firstFreedayAtTheMonth; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо поготовить отчет!");
        }

        System.out.println("Задача 8");
        int period = 79;
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = 0; year <= end; year += period) {
            if (year > +start) {
                System.out.println(year);
            }
        }
    }
}
