package homework9;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Васильев Василий Васильевич", 59, 2600);
        Accountant accountant = new Accountant("Петров Пётр Петрович", 46, 1800);
        Worker worker = new Worker("Иванов Иван Иванович", 34, 1200);

        Employee[] employee = {accountant, worker};

        System.out.println(worker.getSalary());
        director.increaseSalaryOfEmployee(employee, 50, "Иванов Иван Иванович");
        System.out.println(worker.getSalary());
    }
}
