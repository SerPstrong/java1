package lesson1;

public class Main {
    public static void main(String[] args) {
//        ctrl+alt+L
//        System.out.println("Hello world!");
//        System.out.println(5 + 9);
//        System.out.println('a');
//        System.out.println(7 + " + " + 5 + " = " + 12);
//        System.out.println(2 + 2 + " = " + (2 + 2));

//        int a;
//        a = 5;
//        System.out.println(a);

//        byte 8 bit -128..127
//        short  16 bit
//        int 32 bit -2^31 .. 2^31 -1
//        long 64 bit -2^63 .. 2^63 -1

//        long b = 5000000000000675676L;

//        float f=3.6f;
//        double d = 8.9;

//        char c = 'a';
//        char c1 = 65; //ASCII
//        char c2 = '\u0041';
//        System.out.println(c2);

//        boolean bool;
//        bool = true;
//        bool = false;
//        bool = 4>7;
//        System.out.println(bool);

//        final int aa = 6;

//        int a = 10;
//        System.out.println(a++);
//        System.out.println(++a);
//        System.out.println(a);
//        a--;
//        --a;

//        a += 5;
//        a -= 7;
//        a *= 2;
//        a /= 3;
//        a %= 4;
//        System.out.println(a);

//        printHelloWorld();
//        printHelloWorld();
//        printHelloWorld();

//        printFormattedWord("java");
////        printFormattedWord("core");

//        System.out.println(discrimenant(1,3,2));


//        if (discrimenant(1, 6, 5) >= 0) {
//            System.out.println("есть корни");
//        } else {
//            System.out.println("корней нет");
//        }

//        printAceStatus(-40);

//        printFootballStatus(5, 10, 6);
////        printFootballStatus(5, 10, 5);
////        printFootballStatus(5, 10, 35);

//        System.out.println(isPositiveOrEven(-5));
//
//        String s1 = "tyt";

        int x = 0x10;
        System.out.println(x);
    }

    public static void printHelloWorld() {
        System.out.println("    ===++===");
        System.out.println("   ===++++===");
        System.out.println("  Hello world!");
        System.out.println(" ==============");
        System.out.println("================");
    }

    public static void printFormattedWord(String s) {
        System.out.println("======");
        System.out.println(s);
        System.out.println("======");
    }

    public static double discrimenant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void printAceStatus(int temp) {
        if (temp > 0) {
            System.out.println("Лед растает ");
        } else {
            System.out.println("Лед останется льдом");
        }
    }

    public static void printFootballStatus(int a, int b, int x) {
        if (a < x && x < b) {
            System.out.println("Гол!!!");
        } else {
            System.out.println("Промах...");
        }
    }

    public static boolean isPositiveOrEven(int a) {
        if (a % 2 == 0 || a > 0) {
            return true;
        } else {
            return false;
        }

//        return a % 2 == 0 || a > 0;
    }

}
