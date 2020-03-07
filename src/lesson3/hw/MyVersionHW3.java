package lesson3.hw;

import java.util.Random;
import java.util.Scanner;

public class MyVersionHW3 {
    //    1. Написать программу, которая загадывает случайное число от 0 до 9,
//    и пользователю дается 3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить больше ли указанное
//    пользователем число чем  загаданное, или меньше. После победы или
//    проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
//    (1 – повторить, 0 – нет).
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
//        game();
        guessWord();
    }

    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int secret = random.nextInt(words.length);
        System.out.println(words[secret]);
        System.out.println("Угадайте слово. ");

        while (true) {
            System.out.println("Введите слово");
            String answer = sc.nextLine();
            if (answer.equals(words[secret])) {
                System.out.println("yes");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < words[secret].length() && i < answer.length()
                            && words[secret].charAt(i) == answer.charAt(i)) {
                        System.out.print(answer.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
            }
        }
        System.out.println("Вы угадали, это слово " + words[secret]);
    }


    public static void game() {
        int answer;
        int max = 10;
        do {
            int secret = random.nextInt(max);
            boolean guess = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число в интервале от 0 до " + (max - 1));

                int userNumber = sc.nextInt();
                if (userNumber > secret) {
                    System.out.println("userNumber > secret");
                }
                if (userNumber < secret) {
                    System.out.println("userNumber < secret");
                }
                if (userNumber == secret) {
                    guess = true;
                    break;
                }
            }
            if (guess) {
                System.out.println("Вы угадали! Это число = " + secret);
            } else {
                System.out.println("Вы НЕ угадали! Это число было = " + secret);
            }
            System.out.println("Хотите играть еще раз? 1 -да");

//            String answ = sc.nextLine();
//            answer = Integer.parseInt(answ);

            answer = sc.nextInt();
        } while (answer == 1);
        System.out.println("Спасибо за игру!");
    }

    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
