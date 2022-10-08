package com.company;

import java.util.Scanner;

public class Main {
    //1.линейный поиск
    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //2.бинарный поиск
    public static int binarySearch(int[] array, int value) {
        int lBorder = 0;
        int rBorder = array.length - 1;
        while (lBorder <= rBorder) {
            int mid = lBorder + (rBorder - lBorder) / 2;
            if (array[mid] == value){
                return mid;
            } else if (value < array[mid]) {
                rBorder = mid - 1;
            } else if (value > array[mid]) {
                lBorder = mid + 1;
            }
        }
        return -1;
    }

    public static int[] createArray(int size, int begin, int end) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(end - begin + 1) + begin);
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0 ; i < array.length; i++) {
            for (int j = i+1 ; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int data = array[i];
                    array[i] = array[j];
                    array[j] = data;
                }
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

    public static int findMaxInArray(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int findMinInArray(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }

    public static void replaceElementsInArray(int[] array, int index1, int index2) {
        int data = array[index1];
        array[index1] = array[index2];
        array[index2] = data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = createArray(20, -999, 999);
        sortArray(array);
        replaceElementsInArray(array, findMaxInArray(array), findMinInArray(array));
        displayArray(array);

        System.out.print("Введите искомое число: ");
        int intToFind = scanner.nextInt();

        int binaryFind = binarySearch(array, intToFind);
        System.out.println(binaryFind);
    }
}
