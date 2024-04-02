public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int[] spending = {13000, 20000, 14000, 22500, 14500};
        int sum = 0;
        for (int i = 0; i < spending.length; i++) {
            sum = sum + spending[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        sum = 0;
        for (int element : spending) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println(" ");
        System.out.println("Задание 2:");
        int spendingMax = spending[0];
        int spendingMin = spending[0];
        for (int i = 0; i < spending.length; i++) {
            final int current = spending[i];
            if (current > spendingMax) {
                spendingMax = current;
            }
            if (current < spendingMin) {
                spendingMin = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + spendingMin + " рублей. Максимальная сумма трат за неделю составила " + spendingMax + " рублей");
        System.out.println(" ");
        System.out.println("Задание 3:");
        sum = 0;
        for (int i = 0; i < spending.length; i++) {
            sum = sum + spending[i];
        }
        double result = 1.0 * sum / spending.length;
        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей");
        System.out.println(" ");
        System.out.println("Задание 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
    }
}