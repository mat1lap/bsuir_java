import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Создать трехмерный массив из целых чисел.
//        С помощью циклов "пройти" по всему массиву и увеличить каждый
//        элемент на заданное число. Пусть число, на которое будет
//        увеличиваться каждый элемент, задается из консоли.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int[][][] array= new int[(int)(Math.random() * 2) + 2][(int)(Math.random() * 4) + 2][(int)(Math.random() *6) + 5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int)(Math.random() * 99) + 1;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += num;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("////////////////////////\n");

//        2. Шахматная доска
//        Создать программу для раскраски шахматной доски с помощью цикла.
//                Создать двумерный массив String'ов 8х8. С помощью циклов задать
//        элементам циклам значения B(Black) или W(White). Результат работы
//        программы:
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W

        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n////////////////////////\n");

//        3. Умножение двух матриц
//        Создайте два массива целых чисел размером 3х3 (две матрицы).
//                Напишите программу для умножения двух матриц.
//                Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
//        Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//        Ожидаемый результат: 1 2 3 1 1 1 0 0 0

        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int)(Math.random() * 99) + 1;
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            for(int j = 0; j < array2[i].length; j++) {
                array2[i][j] = (int)(Math.random() * 99) + 1;
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            for(int j = 0; j < array2[i].length; j++) {
                System.out.print(array1[i][j] * array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n////////////////////////\n");

//        4. Создайте двумерный массив целых чисел. Выведите на консоль сумму
//        всех элементов массива.

        int[][] arraySum= new int[(int)(Math.random() * 6) + 5][(int)(Math.random() * 6) + 5];
        int sum = 0;
        for (int i = 0; i < arraySum.length; i++) {
            for (int j = 0; j < arraySum[i].length; j++) {
                arraySum[i][j] = (int)(Math.random() * 99) + 1;
                sum += arraySum[i][j];
                System.out.print(arraySum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nСумма всех чисел массива: " + sum);
        System.out.println("\n////////////////////////\n");

//        5. Создайте двумерный массив. Выведите на консоль диагонали массива.

        int[][] arrayDiognal= new int[10][10];
        for (int i = 0; i < arrayDiognal.length; i++) {
            for (int j = 0; j < arrayDiognal[i].length; j++) {
                arrayDiognal[i][j] = (int)(Math.random() * 90) + 10;
                System.out.print(arrayDiognal[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arrayDiognal.length; i++) {
            for (int j = 0; j < arrayDiognal[i].length; j++) {
                if ((i == j) || (j == arrayDiognal[i].length - i - 1)) {
                    System.out.print(arrayDiognal[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}