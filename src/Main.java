public class Main { // Класс Main
    public static void main(String[] args) { // Метод Main

        task1();

        task2();

        task3();

        task4();

    }

    public static int[] generateRandomArray() { // Объявление метода сгенерироватьМассив

        java.util.Random random = new java.util.Random();

        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;

    }

    public static void task1() {

        System.out.println("Задача 1");

        int[] arr = generateRandomArray(); // Объявление и вызов метода сгенерироватьМассив
        int sumOfWaste = 0;

        for (final int current : arr) {

            sumOfWaste += current;

        }

        System.out.printf("Сумма трат за месяц %,d рублей.%n", sumOfWaste);
        System.out.println();

    }

    public static void task2() {

        System.out.println("Задача 2");

        int[] arr = generateRandomArray(); // Объявление и вызов метода сгенерироватьМассив
        int maxWaste = arr[0];
        int minWaste = arr[0];

        for (final int current : arr) {
            if (current > maxWaste) {
                maxWaste = current;
            }
        }

        System.out.printf("Максимальная сумма трат за день составила %,d рублей.%n", maxWaste);

        for (final int current : arr) {
            if (current < minWaste) {
                minWaste = current;
            }
        }

        System.out.printf("Минимальная сумма трат за день составила %,d рублей.%n", minWaste);
        System.out.println();

    }

    public static void task3() {

        System.out.println("Задача 3");

        int[] arr = generateRandomArray(); // Объявление и вызов метода сгенерироватьМассив
        int quantityOfMonth = arr.length;
        double sumOfWaste = 0;

        for (final int current : arr) {
            sumOfWaste += current;
        }

         double averageSumOfWaste = sumOfWaste / quantityOfMonth;

        System.out.printf("Средняя сумма трат за месяц составила %,.2f рублей.%n", averageSumOfWaste);
        System.out.println();

    }

    public static void task4() {

        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}