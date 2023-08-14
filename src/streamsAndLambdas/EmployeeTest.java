package streamsAndLambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Moses", "Hunsu", 500000.00, "IT"),
                new Employee("Noah", "Johnson", 400000.00, "Sales"),
                new Employee("Emperor", "Adeolu", 300000.00, "Marketing"),
                new Employee("Pelumi", "Joaquin", 350000.00, "Sales"),
                new Employee("Chidinma", "Afogu", 250000.00, "Marketing"),
        };

        List<Employee> employeeList = Arrays.asList(employees);
        System.out.println("Complete employee list");
        employeeList.forEach(System.out::println);

        System.out.println("Sort Based on salary");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        System.out.println("Filter employee based on a particular salary range");
        Predicate<Employee> employeesWithSalaryRange =
                employee -> employee.getSalary() >= 400000 && employee.getSalary() <= 600000;
        employeeList.stream().filter(employeesWithSalaryRange).forEach(System.out::println);



    }

}
