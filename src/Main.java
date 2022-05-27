public class Main {
    public static void main(String[] args) {
        int balance = 3;
        int bonusPay = 100;
        int payment = 1010;
        int bonus = 0;

        if (payment >= 1000) {
            bonus = payment / bonusPay;

        }

        int totalbalance = balance + payment + bonus;

        System.out.println("Вы пополнили счёт на: " + payment + " руб.");
        System.out.println("Ваш бонус составил: " + bonus + " руб.");
        System.out.println("Ваш баланс: " + totalbalance + " руб.");
        System.out.println("Спасибо что пользуетесь услугами нашей компании");

    }
}