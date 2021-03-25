// Homework 3 Java Level 1 Ksenia Panarina
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
/*
1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю
 дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
 больше ли указанное пользователем число, чем загаданное, или меньше. После победы или
 проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/
    private static int LIMIT_RANDOM = 10;
    private static int MAX_ATTEMPTS_COUNT = 3;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            GuessTHeNumber();
            System.out.println("\nПовторить игру еще раз? 1 – да / 0 – нет.");
        } while (1 == scanner.nextInt());
    }
    public static void GuessTHeNumber() {
        int number = random.nextInt(LIMIT_RANDOM);
        int attempts = MAX_ATTEMPTS_COUNT;
        int guess;
        System.out.printf("Введите целое число от 0 до %d. ", LIMIT_RANDOM - 1);
            do {
                System.out.printf("Число попыток: %d\n", attempts);

                guess = scanner.nextInt();
                String response;

                if (guess > number) {
                    response = "Неверно! Загаданное число меньше. ";
                } else if (guess < number) {
                    response = "Неверно! Загаданное число больше. ";
                } else {
                    response = "Верно!";
                }

                System.out.print(response);
            } while (guess != number && --attempts > 0);
        System.out.println("Было загадано число: " + number);
        }
    }

