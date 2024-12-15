public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int balance = 200;
        int topUp = 1300;

        int bonus;
        if (topUp > 1000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
            }
        int finaleBalance = balance + topUp + bonus;
        System.out.println("Бонус за мили: " + bonus);
        System.out.println("Итоговый счёт: " + finaleBalance);

        }


    }