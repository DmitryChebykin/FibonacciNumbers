import java.util.Scanner;

public class FibonacciNumbers {
    public static final int MAXIMUM_ENABLED_FIBONACCI_SERIES_COUNT = 93;

    public static void main(String[] args) {
        System.out.printf("Введите номер числа Фибоначчи, которое необходимо рассчитать," +
                " но не более %d:%n", MAXIMUM_ENABLED_FIBONACCI_SERIES_COUNT);

        Scanner scanner = new Scanner(System.in);

        int inputCount = scanner.nextInt();

        if (!(inputCount <= MAXIMUM_ENABLED_FIBONACCI_SERIES_COUNT && inputCount > 0)) {
            System.out.println("Неверное значение. Расчет производится не будет.");
        } else {
            long fibonacciNumber = fibonacciNumber(inputCount);
            System.out.printf("Значение числа Фибоначчи под номером %d равно %d%n", inputCount, fibonacciNumber);
        }

        System.out.println("Вывести весь ряд Фибоначчи до заданного числа Y|N ? :");
        String answer = scanner.next();

        if (answer.equals("Y") || answer.equals("y")) {
            for (int i = 1; i<=inputCount; i++){
                long fibonacciNumberToConsole = fibonacciNumber(i);
                System.out.printf("Число №%d - %d%n", i, fibonacciNumberToConsole);
            }
        }
    }

    public static long fibonacciNumber(int count) {

        long fibonacciNumber = 0;
        long previousFibonacciNumber = 0;

        for (int i = 0; i <= count - 1; i++) {
            if (i <= 1) {
                fibonacciNumber += i;
            } else {
                long temp = fibonacciNumber;
                fibonacciNumber += previousFibonacciNumber;
                previousFibonacciNumber = temp;
            }
        }

        return fibonacciNumber;
    }
}