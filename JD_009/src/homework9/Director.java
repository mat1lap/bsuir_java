package homework9;

public class Director extends Employee{

    public Director(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void increaseSalaryOfEmployee(Employee[] arrayOfEmployees, int salaryToAdd, String nameOfEmployee) {
        for(Employee employee : arrayOfEmployees) {
            if (employee.getName() == nameOfEmployee) {
                employee.increaseSalary(salaryToAdd);
            }
        }
    }
}

