package homework4;

import java.util.Scanner;

public class tusk2_3 {
    public static int random(int begin,int end) {
        return (int)(Math.random()*(end - begin + 1) + begin);
    }

    public static int[][] create2Array(int size1, int size2, int begin, int end) {
        int[][] array = new int[size1][size2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random(begin, end);
            }

        }
        return array;
    }

    public static void displayArray(int[] array) {
        for (int value: array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void display2Array(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        2. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.
//        3. В данной матрице найти наименьший элемент в каждой строке.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.print("Введите m: ");
        int m = scanner.nextInt();

        int[][] array1 = create2Array(n, m, 1, 9);
        display2Array(array1);

        int counter7 = 0;
        int [] min = new int[array1.length];
        for (int i = 0; i < min.length; i++) {
            min[i] = array1[i][0];
        }
        for (int i = 0; i < array1.length; i++) {
            for (int anInt : array1[i]) {
                if (anInt == 7) {
                    counter7++;
                }
                if (min[i] > anInt) {
                    min[i] = anInt;
                }
            }
        }
        System.out.println("Количество чисел 7: " + counter7);
        System.out.println("Минимальное число в каждой строке: ");
        displayArray(min);
    }
}
