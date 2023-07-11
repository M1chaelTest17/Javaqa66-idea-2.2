public class Main {
    public static void main(String[] args) {

        int chek = 100;
        int amount = 1000;


        int percent;
        if (amount >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }

        int sum = amount * percent / 100 + chek + amount;

        System.out.println("Сумма на счёте: " + sum);



        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}