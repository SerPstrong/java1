package l3;

import java.util.Scanner;
import java.util.Random;

public class l3 {

    public static Scanner num = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
//   1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать
//   это число.При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем
//   загаданное, или меньше.После победы или проигрыша выводится запрос – «Повторить игру еще раз?1 –да / 0 –нет»(1 –
//   повторить, 0 –нет).
        runGame();
    }

    public static void runGame() {
        int attempt = 3;
        int counter = 2;
        int randomNumber = rand.nextInt(9);
        int option = 1;

        do {
            System.out.println(randomNumber);//-------------------------
            if (attempt == 3) {
                System.out.println("Игра началась! Введите число:");
            }
            System.out.println("Введите число:");
            int userNumber = num.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Вы выиграли. " +
                        "Хотите начать игру заново? 1 -да, 0 -нет");
                option = num.nextInt();
                if (option == 1) {
                    runGame();
                } else {
                    System.out.println("Вы выбрали 0, игра закончена");
                }
            } else if (userNumber < randomNumber && attempt != 1) {
                System.out.println("Вы не угадали, загаданное число больше. " + "Осталось попыток " + counter);
            } else if (userNumber > randomNumber && attempt != 1) {
                System.out.println("Вы не угадали, загаданное число меньше " + "Осталось попыток " + counter);
            }
            counter--;
            attempt--;
            if (attempt == 0 && userNumber != randomNumber) {
                System.out.println("Вы проиграли! Вы хотите начать игру заново? 1 -да, 0 -нет");
                option = num.nextInt();
                if (option == 1) {
                    runGame();
                } else {
                    System.out.println("Вы выбрали 0, игра закончена");
                }
            }
        } while (attempt > 0 && option == 1);
    }

}
