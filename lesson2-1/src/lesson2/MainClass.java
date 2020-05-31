package lesson2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        findMaxMin();
        int[] arr = {0, 1, 1, 2, 0};
        System.out.print(checkBalance(arr));


    }
    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    public static void invertArray() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    /*2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

    public static void fillArray() {

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i * 3;
            }
        System.out.println(Arrays.toString(arr));
    }
    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2;*/

    public static void changeArray() {

        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++){
            if (w[i] < 6){
                w[i] = w[i] * 2;
            }
            else{
                w[i] = w[i];
            }
        }
        System.out.println(Arrays.toString(w));
    }
    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 1;
            arr[i][3 - i] = 1;
        }
        System.out.println(Arrays.deepToString(arr));
    }
    /*5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);*/

    public static void findMaxMin() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > arr[indexOfMax])
            {
                indexOfMax = i;
            }
            else if (arr[i] < arr[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        System.out.println("max:" + arr[indexOfMax] + " min:" + arr[indexOfMin]);
    }
    /*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.*/

    private static boolean checkBalance(int[] arr) {
        int summLeft = 0;
        int summRight = 0;
        for (int i = 0; i < arr.length; i++){
            summLeft = summLeft + arr[i];
            for (int j = i + 1; j < arr.length ; j++){
                summRight = summRight + arr[j];
            }
            if ( summLeft == summRight ){
                return true;
            }
            else {
                summRight = 0;
            }
        }
        return false;

    }


}
