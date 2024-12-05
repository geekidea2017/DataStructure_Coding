package com.interview.questions;

import java.util.*;
import java.util.stream.Collectors;

class Empl{

    int id;
    String name;
    int salary;
    String dept;

    public Empl(int id, String name, String dept, int salary ) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

public class Synechron3 {
    public static void main(String[] args)
    {
        List<Empl> Empls = Arrays.asList( new Empl(0,"John", "HR", 3000),
                new Empl(1,"Jane", "HR", 3500),
                new Empl(2,"Bob", "IT", 4000),
                new Empl(3,"Alice", "IT", 4200),
                new Empl(4,"Tom", "Sales", 2500),
                new Empl(5,"Jerry", "Sales", 2600) );
        // Group by department and find the Empl with the max salary in each department
        Map<String, Empl> maxSalariesByDept = Empls.stream() .collect(Collectors.groupingBy( Empl::getDept,
            Collectors.collectingAndThen( Collectors.maxBy(Comparator.comparingDouble(Empl::getSalary)), Optional::get ) ));

        maxSalariesByDept.forEach((department, Empl) -> System.out.println(department + " Department - Max Salary: " + Empl.getSalary()) );

        Map<String, Optional<Empl>> lists = Empls.stream().collect(Collectors.groupingBy(Empl::getDept,
                Collectors.maxBy(Comparator.comparingInt(Empl::getSalary))));

        lists.forEach((departments, Emples) -> System.out.println(departments + " : "+ Emples.get().getSalary()));

      /*  List<Empl> list = new ArrayList<>();
        list.add(new Empl(1,"a",1000,"a"));
        list.add(new Empl(2,"b",2000,"b"));
        list.add(new Empl(3,"c",3000,"c"));
        list.add(new Empl(4,"d",4000,"d"));
        list.add(new Empl(5,"e",5000,"e"));
        list.add(new Empl(6,"d",3000,"d"));
        list.add(new Empl(7,"e",2000,"e"));

      //  System.out.println(list);
// have to get 3 highest salary

        Map<String, Optional<Empl>> lists = list.stream().collect(Collectors.groupingBy(Empl::getDept,
                Collectors.maxBy(Comparator.comparingInt(Empl::getSalary))));

        //lists.entrySet().stream().max(Comparator.comparing(Empl::getSalary))
        lists.forEach((dept,emplyee) -> {
            System.out.println(dept + " : " + emplyee.get());
        });
       // System.out.println(lists);*/
    }
}
