package lesson1;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        int[] array = new int[10];
        System.out.println(array.length);

        int sum;
        for(sum = 0; sum < array.length; array[sum] = sum++) {
        }

        int[] var11 = array;
        int max = array.length;

        int min;
        int i;
        for(min = 0; min < max; ++min) {
            i = var11[min];
            System.out.print("" + i + ", ");
        }

        sum = 0;
        int[] var12 = array;
        min = array.length;

        for(i = 0; i < min; ++i) {
            int value = var12[i];
            if (value % 2 == 1) {
                sum += value;
            }
        }

        System.out.print("\n" + sum);
        max = 0;
        min = 0;

        for(i = 1; i < array.length; ++i) {
            if (array[i] > array[max]) {
                max = i;
            }

            if (array[i] < array[min]) {
                min = i;
            }
        }

        i = array[max];
        array[max] = array[min];
        array[min] = i;
        int[] var13 = array;
        int var8 = array.length;

        for(int var9 = 0; var9 < var8; ++var9) {
            int value = var13[var9];
            System.out.print("" + value + ", ");
        }

    }
}

