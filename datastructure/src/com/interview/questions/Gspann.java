package com.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Gspann {
    public static void main(String[] args){
        Employee2 e1 = new Employee2(29, "venkat");
        Employee2 e2 = new Employee2(29, "venkat");
        Map<Employee2, String> map = new HashMap<>();
        map.put(e1, "a");
        map.put(e2, "b");
        System.out.println(e1 == e2);
        System.out.println(map.size());
    }
}

 class Employee2{
    final int  age;
    final String name;
    public Employee2 (int age, String name)
    {
        this.age=age; this.name=name;}


/* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return age == employee2.age &&
                Objects.equals(name, employee2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }*/
}