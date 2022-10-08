package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if(number % 2 == 0) {
            System.out.print("Число " + number + " чётное");
        } else {
            System.out.print("Число " + number + " нечётное");
        }

        System.out.print("\nВведите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int number3 = scanner.nextInt();

        int max = Math.max(number1, Math.max(number2, number3));
        String data = "";
        if (max == number1) {
            data+="первое, ";
        }
        if (max == number2) {
            data+="второе, ";
        }
        if (max == number3) {
            data+="третье, ";
        }
        data = data.substring(0, (data.length()-2));
        System.out.print("Наибольшее число: " + max + " ("+ data + ")");

        System.out.print("\nВведите цвет радуги: ");
        int number0 = scanner.nextInt();
        switch (number0) {
            case 1 -> System.out.print("Красный");
            case 2 -> System.out.print("Оранжевый");
            case 3 -> System.out.print("Жёлтый");
            case 4 -> System.out.print("Зелёный");
            case 5 -> System.out.print("Голубой");
            case 6 -> System.out.print("Синий");
            case 7 -> System.out.print("Фиолетовый");
            default -> System.out.print("Error");
        }

        System.out.print("\nВведите пору года: ");
        int number99 = scanner.nextInt();
        switch (number99) {
            case 1 -> System.out.print("Зима");
            case 2 -> System.out.print("Весна");
            case 3 -> System.out.print("Лето");
            case 4 -> System.out.print("Осень");
            default -> System.out.print("Error");
        }

        System.out.print("\nВведите месяц: ");
        int number100 = scanner.nextInt();
        switch (number100) {
            case 1 -> System.out.print("Январь");
            case 2 -> System.out.print("Февраль");
            case 3 -> System.out.print("Март");
            case 4 -> System.out.print("Апрель");
            case 5 -> System.out.print("Май");
            case 6 -> System.out.print("Июнь");
            case 7 -> System.out.print("Июль");
            case 8 -> System.out.print("Август");
            case 9 -> System.out.print("Сентябрь");
            case 10 -> System.out.print("Октябрь");
            case 11 -> System.out.print("Ноябрь");
            case 12 -> System.out.print("Декабрь");
            default -> System.out.print("Error");
        }

        System.out.print("\nВведите Температуру: ");
        double temperature = scanner.nextDouble();

        if (temperature > -5) {
            System.out.print("Тепло");
        } else if (temperature >= -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }

        int[] array = new int[10];
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        for (int value : array) {
            System.out.print(value + ", ");
        }
        int sum = 0;
        for (int value : array) {
            if (value % 2 == 1) {
                sum += value;
            }
        }
        System.out.print("\n" + sum);
        int max1 = 0;
        int min1 = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] > array[max1]) {
                max1 = i;
            }
            if (array[i] < array[min1]) {
                min1 = i;
            }
        }
        int arr_data = array[max1];
        array[max1] = array[min1];
        array[min1] = arr_data;
        for (int value : array) {
            System.out.print(value + ", ");
        }
    }
}