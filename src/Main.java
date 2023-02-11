public class Main {
    public static void main(String[] args) {

        int account = 20;
        int deposit = 10000;

        int bonus;
        if (deposit > 20) {
            bonus = deposit / 20;
        } else {
            bonus = 0;
        }
        int totalAmount = deposit;

        System.out.println("Сумма стоимости билета: ");
        System.out.println(totalAmount);
        System.out.println("P");
        System.out.println("бесплатные мили за перелёты: ");
        System.out.println(bonus);
        System.out.println("P");
    }
}