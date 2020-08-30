package guess_the_number;

import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        System.out.println("Ваша задача угадать число ");

// генерируем случайное число, которое будем угадывать

        Random random = new Random();
        int randNum = random.nextInt(9);

        playLevel(randNum);
    }

    private static void playLevel (int number) {
        System.out.println("У тебя 3 попытки, чтобы угадать число от 0 до 9");

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("------------------");
            System.out.println("Попытка №" + i);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Вы угадали!!!");
                break;
            } else if (input_number > number && i != 3){
                System.out.println("Загаданное число меньше");
            } else if (input_number < number && i != 3) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Вы проиграли!!!");
            }
        }
    }
}
