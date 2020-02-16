package l3;

import java.sql.SQLOutput;
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
        ranNum();

    }

    public static void ranNum() {
        int attempt = 3;
        int randomNumber = rand.nextInt(9);
        int numb;

        do {
            System.out.println("Введите число:");
            int n = num.nextInt();
            if (n == randomNumber) {
                System.out.println("Вы угадали");
            } else {
                System.out.println("Вы не угадали");


            }
            attempt--;
        } while (attempt > 0);


    }

}
