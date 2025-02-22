public class Main {
    public static void main(String[] args) {

        //Задание 1
        int cash = 0;
        int month = 0;
        while (cash < 2_495_000){
            month++;
            cash += 15_000 + cash * 10/100;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + cash + " рублей");

        //Задание 2
        int i = 1;
        while ( i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (; i > 1; i--) {
            System.out.print( i-1 + " ");
        }
        System.out.println();

        //Задание 3
        int Y = 12000000;
        int year = 0;
        while (year < 10){
            year++;
            Y += Y * 17 / 1000 - Y * 8 / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + Y);
        }

        //Задание 4
        month = 0;
        cash = 15_000;
        while (cash < 12_000_000){
            month++;
            cash += cash * 7/100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + cash + " рублей");
        }
        System.out.println();

        //Задание 5
        month = 0;
        cash = 15_000;
        while (cash < 12_000_000){
            month++;
            cash += cash * 7/100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + cash + " рублей");
            }
        }
        System.out.println();

        //Задание 6
        month = 0;
        cash = 15_000;
        while (month <= 9 * 12){
            month++;
            cash += cash * 7/100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + cash + " рублей");
            }
        }
        System.out.println();

        // Задание 7
        int dateFriday;
        for (dateFriday = 7; dateFriday <= 31; dateFriday += 7) {
            System.out.println("Сегодня пятница, " + dateFriday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        // Задание 8
        year = 0;
        while (year <= 2125){
            if (year >= 1825){
                System.out.println(year);
            }
            year += 79;
        }



    }
}