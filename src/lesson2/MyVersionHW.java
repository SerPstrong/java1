package lesson2;

import java.util.Arrays;

public class MyVersionHW {
    public static void main(String[] args) {
//    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;

//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        for (int i = 0; i < arr.length; i++) {
////            arr[i] = arr[i] == 0 ? 1 : 0;
//            arr[i] = 1 - arr[i];
////            if (arr[i] == 0) {
////                arr[i] = 1;
////            } else {
////                arr[i] = 0;
////            }
//        }
//        System.out.println(Arrays.toString(arr));


        //2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

//        int[] arr = new int[8];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i * 3;
////            arr[i]=arr[i-1] + 3;
//        }

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
// и числа меньшие 6 умножить на 2;
//        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 6) {
//                arr[i] *= 2;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        printArr(factoryArr(16));
//        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
//        System.out.println(checkBalance(arr));

        int[] arr = {2, 4, 5, 1, 8, 7, 10, 88};
        System.out.println(Arrays.toString(shiftArr(arr, 9)));
        ;
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
// одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static int[][] factoryArr(int n) {
        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            arr[i][i] = 1;
//            arr[i][n - 1 - i] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j || i + j == n - 1) {
//                    arr[i][j] = 1;
//                }
//            }
//        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
// (без помощи интернета);

//    public static int maxValue(int[] arr) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место,
// в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
// эти символы в массив не входят.

    public static boolean checkBalance(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        if (summ % 2 != 0) {
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        while (sumLeft < summ / 2) {
            sumLeft += arr[i];
            i++;
        }
        return sumLeft == summ / 2;
    }

// 7. **** Написать метод, которому на вход подается одномерный массив
// и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//

    public static int[] shiftArr(int[] arr, int n) {
        int k = n % arr.length + arr.length;
        for (int i = 0; i < k; i++) {
            int tmp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = tmp;
        }
        return arr;
    }

}
