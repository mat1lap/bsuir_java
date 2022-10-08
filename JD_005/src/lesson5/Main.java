package lesson5;

public class Main {
    public static int random(int min,int max) {
        return (int)(Math.random()*(max - min + 1) + min);
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
    public static void display2Array(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void figureArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (((j < array[i].length - i) && (j >= i)) || ((j >= array[i].length - i - 1) && (j <= i))) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static int[][] createArrayPyramid(int size) {
        int[][] array = new int[size][size];
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= i; j++) {
                    array[i][j] = counter;
                    counter++;
                }
            } else {
                for (int j = i; j >= 0; j--) {
                    array[i][j] = counter;
                    counter++;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int data = random(5, 20);
        int[][] array0 = create2Array(data, data, 0, 0);
        figureArray(array0);
        display2Array(array0);

	    int[][] array1 = createArrayPyramid(data);
        display2Array(array1);

        System.out.printf("%-5s%-11s%-25s%-11s%n", "Код", "За единицу", "Валюта", "Рубли");
        System.out.println("----------------------------------------------");
        System.out.printf("%-5s%-11d%-25s%-11.2f%n", "USD", 1, "Доллар США", 2.56);
        System.out.printf("%-5s%-11d%-25s%-11.2f%n", "EUR", 1, "Евро", 2.54);
    }
}