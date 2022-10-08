package homework5;

import java.util.Scanner;

public class tusk1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество сотрудников: ");
        int n = scanner.nextInt();
        String[] people = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите имя сотрудника " + (i + 1) + ": ");
            people[i] = scanner.next();
        }
        int[][] salary = new int[n][4];
        for (int i = 0; i < n; i++){
            System.out.println("Введите зарплату сотрудника " + people[i] + " за 4 квартала: ");
            for (int j = 0; j < 4;  j++) {
                salary[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%n", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого");
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < n; i++){
            System.out.printf("%-20s%-10d%-10d%-10d%-10d%-10d%n", people[i], salary[i][0], salary[i][1], salary[i][2], salary[i][3], (salary[i][0] + salary[i][1] + salary[i][2] + salary[i][3]));
        }
        System.out.println("-------------------------------------------------------------------------");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += salary[i][0] + salary[i][1] + salary[i][2] + salary[i][3];
        }
        System.out.printf("%-20s%-10d%n", "Итого", sum);
        System.out.printf("%-20s%-10.4f%n", "Средняя", ((double)sum/n));
    }
}