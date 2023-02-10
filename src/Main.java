public class Main {
    public static void main(String[] args) {
        int account = 100;
        int accountRefill = 1100;
        int bonus;

        if (accountRefill > 1000) {
            bonus = accountRefill / 100;
        } else {
            bonus = 0;
        }

        int balance = account + accountRefill + bonus;
        System.out.println("Спасибо за ваш платеж. Ваш баланс: " + balance + " руб. Ваш бонус: " + bonus + " руб.");
    }
}