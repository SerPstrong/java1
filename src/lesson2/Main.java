package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    //    static int i;
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        printWords(7,"Java");

//        for (byte i = 100; i != 0; i++) {
//            System.out.print(i + " ");
//        }

//        int i;
//        for (i = 0; i < 5; i++) {
//
//        }
//        System.out.println(i);

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("i= " + i + " j= " + j);
//            }
//        }

//        printMultyTable(10);

//        for (int i = 0, n = 10; i < 5; i++, n--) {
//            System.out.println(i + " " + n);
//        }

//        for (int i = 1; i <=1024 ; i*=2) {
//            System.out.print(i+" ");
//        }

//        for (int i = 100; i > 1 ; i-=10) {
//            System.out.print(i+" ");
//        }

//        for ( ; ; ) {
//            System.out.print("*");
//        }

//        int n = 100;
//        for (int i = 1; i <=n ; i++) {
//            if(n % i == 0){
//                System.out.print(i+" ");
//            }
//        }
//        int y = 256;
//        while (y > 0) {
//            System.out.print(y + " ");
//            y /= 2;
//        }

//        int x = 345234;
//        int k = 2;
//        while (x > 1) {
//            while (x % k == 0) {
//                System.out.print(k + " * ");
//                x /= k;
//            }
//            k++;
//        }

//        int x = 1;
//        do {
//            System.out.println(x);
//            x += 3;
//        } while (x < 10);

//        for (int i = 0; i < 10; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }

//        for (int i = 1; i < 10; i++) {
//            if (i % 3 == 0) {
//                break;
//            }
//            System.out.print(i + " ");
//        }

        int n = 1;
//        if (n == 12 || n == 1 || n == 2) {
//            System.out.println("winter");
//        }
//        if (n == 3 || n == 4 || n == 4) {
//            System.out.println("spring");
//        }

//        switch (n) {
//            case 12:
//                System.out.println("december");
//                break;
//            case 1:
//                System.out.println("january");
//                break;
//            case 2:
//                System.out.println("winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("spring");
//                break;
//            default:
//                System.out.println("no ");
//        }

//        int[] arr = new int[10];
//        arr[0] = 5;
//        arr[1] = 25;
//        System.out.println(Arrays.toString(arr));
//
//        int[] arr2 ={1,2,3};
//        System.out.println(Arrays.toString(arr2));
//
//        String[] strArr = {"1123","23423","qwe","reter"};
//        System.out.println(Arrays.toString(strArr));

//        int[] arr = new int[10];
//
//        Random rand = new Random();
//        for (int i = 0; i < arr.length; i++) {
////            arr[i] = i;
//            arr[i] = rand.nextInt(100);
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                arr[i] += 1000;
//            }
////            if(i%2==0)
//        }
//        System.out.println(Arrays.toString(arr));

//        int[] a = {1, 2, 3};
//        int[] b = {4, 5, 6};
//
//        b = a;
//        b[1] = 99;
//        a[2] = 77;
//
//        System.out.println(Arrays.toString(a));

//        String[] strArr = new String[5];
//        strArr[4] ="qwe";
//        strArr[1] ="asd";
//        System.out.println(Arrays.toString(strArr));

//        String[][] arr2d = new String[4][];
//        arr2d[0] = new String[3];
//        arr2d[1] = new String[]{"rty","ert"};

//        String[][] arr2d = {
//                {"asd", "sdf", "dfg"},
//                {"asdee", "sdfee", "dfgee", "tyuytu"},
//                {"asde", "wsdf"}
//        };
//
//        printarr2D(arr2d);

        int[] a = {1, 4, -4, -7, 2, 4};
        int[] b = arrReverse(a);
        System.out.println(Arrays.toString(b));

    }

    static void printWords(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    static void printMultyTable(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }

    static void printarr2D(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.println();
        }
    }

    static int[] arrReverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        return arr;
    }

}
