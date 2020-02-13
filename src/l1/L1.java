package l1;

public class L1 {

    public static void main(String[] args) {

        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 12.23f;
        double doubleVar = 123.123;
        char charVar = 'c';
        boolean booleanVar = 5 > 2;
        String stringVar = "string";

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(charVar);
        System.out.println(booleanVar);
        System.out.println(stringVar);

        System.out.println(med(3, 4, 30, 6));

        System.out.println(compare(11, 4));

        integerCompare(-1);

        System.out.println(boolCompare(5));

        stringMed("Сергей");

        System.out.println(getYear(2020));
    }

    public static int med(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean compare(int a, int b) {
        if ((a + b) >= 10 && (a - b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void integerCompare(int a) {
        if (a < 0 && a != 0) {
            System.out.println("Чило " + a + " отрицательное.");
        } else {
            System.out.println("Чило " + a + " положительное.");
        }
    }

    public static boolean boolCompare(int a) {
        if (a < 0 && a != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void stringMed(String a) {
        System.out.println("Привет, " + a);
    }

    static String getYear(int yearLeap) {
        if (((yearLeap % 4 == 0) && !(yearLeap % 100 == 0)) || (yearLeap % 400 == 0))
            return yearLeap + " год, является високосным";
        else
            return yearLeap + " год, не является високосным";
    }
}
