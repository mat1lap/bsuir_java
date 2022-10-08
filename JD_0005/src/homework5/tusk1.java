package homework5;

import java.util.Scanner;

public class tusk1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество сотрудников: ");
        int n = scanner.nextInt();
        String[] people = new String[n];

        for(int i = 0; i < n; ++i) {
            System.out.println("Введите имя сотрудника " + (i + 1) + ": ");
            people[i] = scanner.next();
        }

        int[][] salary = new int[n][4];

        int sum;
        int i;
        for(sum = 0; sum < n; ++sum) {
            System.out.println("Введите зарплату сотрудника " + people[sum] + " за 4 квартала: ");

            for(i = 0; i < 4; ++i) {
                salary[sum][i] = scanner.nextInt();
            }
        }

        System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%n", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого");
        System.out.println("-------------------------------------------------------------------------");

        for(sum = 0; sum < n; ++sum) {
            System.out.printf("%-20s%-10d%-10d%-10d%-10d%-10d%n", people[sum], salary[sum][0], salary[sum][1], salary[sum][2], salary[sum][3], salary[sum][0] + salary[sum][1] + salary[sum][2] + salary[sum][3]);
        }

        System.out.println("-------------------------------------------------------------------------");
        sum = 0;

        for(i = 0; i < n; ++i) {
            sum += salary[i][0] + salary[i][1] + salary[i][2] + salary[i][3];
        }

        System.out.printf("%-20s%-10d%n", "Итого", sum);
        System.out.printf("%-20s%-10.4f%n", "Средняя", (double)sum / (double)n);
    }
}
