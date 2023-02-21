public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        int[] arr = generateRandomArray();
        {
            System.out.println("Задача 1");
            int sum = 0;
            for (int element : arr) {
                sum += element;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        System.out.println(" ");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        {
            System.out.println("Задача 2");
            int maxArr = -1;
            int minArr = 200000;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxArr) {
                    maxArr = arr[i];
                }
                if (arr[i] < minArr) {
                    minArr = arr[i];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей.");
            System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей.");
            System.out.println(" ");
        }

    }

    public static void task3() {
        int[] arr = generateRandomArray();
        {
            System.out.println("Задача 3");
            double average = 0;
            if (arr.length > 0) {
                double sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                average = sum / arr.length;
            }
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
            System.out.println(" ");
        }

    }

    public static void task4() {

        {
            System.out.println("Задача 4");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i =reverseFullName.length-1; i >=0; i--) {
                System.out.print(reverseFullName[i]);
            }


        }

    }
}
