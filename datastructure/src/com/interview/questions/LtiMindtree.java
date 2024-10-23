package com.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 60000.0),
                new Employee("John1", 60000.0),
                new Employee("John2", 60000.0),
                new Employee("Jane", 75000.0),
                new Employee("Jane1", 75000.0),
                new Employee("Bob", 55000.0),
                new Employee("Alice", 80000.0)
        );

        Optional<Employee> secondHighestSalaryEmployee = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .skip(1)
                .findFirst();

        secondHighestSalaryEmployee.ifPresent(employee ->
                System.out.println("Employee with second highest salary: " + employee.getName())
        );
    }
}
