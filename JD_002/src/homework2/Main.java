package homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1. Пользователь вводит три числа. Найти сумму тех чисел, которые делятся на 5. Если таких чисел нет, то вывести error.
//        2. Создать массив, каждый элемент которого равен квадрату своего номера.
//        3. Найдите сумму чисел массива, которые стоят на четных местах.

//      1.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int number3 = scanner.nextInt();

        int sum = 0;
        if (number1 % 5 == 0) {
            sum += number1;
        }
        if (number2 % 5 == 0) {
            sum += number2;
        }
        if (number3 % 5 == 0) {
            sum += number3;
        }
        if (sum == 0) {
            System.out.print("\nError");
        } else {
            System.out.print("Сумма чисел кратных 5: " + sum);
        }

//      2.
        System.out.print("\nВведите количество элементов: ");
        int index = scanner.nextInt();

        System.out.print("\nЭлементы: ");
        int[] array = new int[index];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
            System.out.print(array[i] + ", ");
        }

//      3.
        int arr_sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i+1) % 2 == 0)  {
                arr_sum += array[i];
            }
        }
        System.out.print("\nСумма, элементов стоящих на чётных местах: " + arr_sum);
    }
}
