
package l2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class L2 {
    public static void main(String[] args) {
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arrayNum = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] == 1) {
                arrayNum[i] = 0;
            } else {
                arrayNum[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arrayNum));


//        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arrayNull = new int[8];
        int jPl = 0;

        for (int i = 0; i < 8; i++) {

            arrayNull[i] = jPl;
            jPl = jPl + 3;
        }

        System.out.println(Arrays.toString(arrayNull));

//        3. Задать массив[ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arrayMul = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arrayMul.length; i++) {
            if (arrayMul[i] < 6) {
                arrayMul[i] = (arrayMul[i] * 2);
            }
        }

        System.out.println(Arrays.toString(arrayMul));


//        4. Создать квадратный двумерный целочисленный массив(количество строк и столбцов одинаковое), и с помощью
//        цикла(-ов) заполнить его диагональные элементы единицами;

        fillDiagonal();

    }

//        5. **Задать одномерный массив и найти в нем минимальный и максимальный элементы(без помощи интернета);

//        6. **Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть

//        true, если в массиве есть место, в котором сумма левой и правой части массива равны.Примеры:
//        checkBalance([2, 2, 2, 1, 2, 2, ||10, 1]) →true, checkBalance([1, 1, 1, ||2, 1]) →true, граница
//        показана символами ||,эти символы в массив не входят.

//        7. ****Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
//        отрицательным),при этом метод должен сместить все элементымассива на n позиций.Для усложнения задачи нельзя
//        пользоваться вспомогательными массивами.


    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == i || j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                ;
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.println();
        }
    }
}