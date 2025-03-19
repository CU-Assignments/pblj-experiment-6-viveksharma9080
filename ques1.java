import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 25, 80000),
            new Employee("Bob", 30, 75000),
            new Employee("Charlie", 22, 90000),
            new Employee("David", 27, 85000)
        );

        employees.sort(Comparator.comparing(e -> e.name));

        employees.forEach(System.out::println);
    }
}
