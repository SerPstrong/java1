package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String... args) {
//        int x = sc.nextInt();
//        int y = sc.nextInt();
////
//////        System.out.println(x + " + " + y + " = " + (x + y));
//        System.out.printf("%d + %d = %d\n", x, y, x + y);

//        String name = sc.nextLine();
////        name = sc.nextLine();
//
//        System.out.println(name + " hello!");

//        String word1 = sc.next();
//        String word2 = sc.next();
//
//        System.out.println(word1 + " hello!" + word2);

//        passwordGame();

//        int a = rand.nextInt(100);//0..99
//        int a = rand.nextInt(101)-50; //-50..50
//        int a = (int) (Math.random()*100);//0..99
//        System.out.println(a);

//        double x = rand.nextDouble() * 100;
//        System.out.println(x);

//        char c = (char) (rand.nextInt(26)+'A');
//        System.out.println(c);

//        System.out.printf("%+d", a);
//        System.out.printf("%10.4f", x);
//        System.out.printf("%10s", "Java");

//        int[] arr = arrGenerator(10, 10);
////        System.out.println(Arrays.toString(arr));
//        printArr(arr);
////        System.out.println(sumArrElements(arr));
//        System.out.println(countArrElementsBetweenMinAndMax(arr, 4, 7));


//        printArr2D(arr2DGenerator(10, 100));

//        System.out.println(sum(5, 7));
//        System.out.println(sum(5, 7, 8));
//        System.out.println(sum(1, 2, 3, 7));
//        System.out.println(sum(1, 2, 7));
//        System.out.println();

        printChars("JavaCore", 2,3,0,6);

//        qwerty
//        asettyrre
//        ##e#ty#########

//        CTRL + ALT + L

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
    }

//    static double sum(double a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    static void printChars(String s, int... args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] < s.length() && args[i] >= 0) {
                System.out.print(s.charAt(args[i]));
            }
        }
        System.out.println();
    }


    static int sum(int... arr) {
        return sumArrElements(arr);
    }

//    static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
//
//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }

//    static int sum(int a, int b) {
//        return a + b;
//    }

    static void printArr2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    static int countArrElementsBetweenMinAndMax(int[] arr, int min, int max) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min <= arr[i] && arr[i] <= max) {
                k += 1;
            }
        }
        return k;
    }

    static int sumArrElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    static int[] arrGenerator(int n, int maxValue) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(maxValue);
        }
        return arr;
    }

    static int[][] arr2DGenerator(int n, int maxValue) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(maxValue);
            }
        }
        return arr;
    }


    static void passwordGame() {
        String pass = "12345";
        String userPass;
        do {
            System.out.println("Введите пароль:");
            userPass = sc.nextLine();
        } while (!pass.equals(userPass));

        System.out.println("Пароль правильный. Доступ получен");
    }

}
