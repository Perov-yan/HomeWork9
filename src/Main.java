public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int[] spending = {13000,20000,14000,22500,14500};
        int sum = 0;
        for (int i = 0; i < spending.length; i++){
            sum = sum + spending[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        sum = 0;
        for (int element : spending){
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
}