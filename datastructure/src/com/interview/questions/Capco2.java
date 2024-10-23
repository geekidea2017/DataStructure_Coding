package com.interview.questions;

/*List<Employee> employees = Arrays.asList(
        new Employee("Alice", "HR", 60000),
        new Employee("Bob", "Engineering", 80000),
        new Employee("Charlie", "Engineering", 90000),
        new Employee("David", "HR", 70000),
        new Employee("Eve", "Marketing", 50000)
        );*/

import java.util.*;
import java.util.stream.Collectors;

class Employee1{
    private String empName;
    private String dept;
    private int salary;

    public Employee1(String empName, String dept, int salary) {
        this.empName = empName;
        this.dept = dept;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class Capco2 {
    public static void main(String[] args){

        List<Employee1> employees = Arrays.asList(
                new Employee1("Alice", "HR", 60000),
                new Employee1("Bob", "Engineering", 80000),
                new Employee1("Charlie", "Engineering", 90000),
                new Employee1("David", "HR", 70000),
                new Employee1("Eve", "Marketing", 50000)
        );
//group based on department and avg salary
//dept with highest salary

        Map<String, Double> groupByDept = employees.stream().collect(Collectors.groupingBy(Employee1::getDept, Collectors.averagingInt(Employee1::getSalary)));
        groupByDept.entrySet().stream().max(Comparator.comparingDouble(Map.Entry::getValue)).stream().forEach(System.out::println);

      //  System.out.println(output);

    }
}



