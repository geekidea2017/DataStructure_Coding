package com.interview.questions;


//Employee class
// id,name

// MAP - 10 record
// sort the map based on employee name key is the Employee object


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

final class Emp {

    private final int id;
    private final String name;
    private final String address;

    Emp(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }



    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id &&
                Objects.equals(name, emp.name) &&
                Objects.equals(address, emp.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}

public class HpMinds {

    public static void main(String[] args){

      Map<Emp,String> empMap = new HashMap();

        empMap.put(new Emp(1,"a","a1"),"a1");
        empMap.put(new Emp(2,"c","a2"),"a2");
        empMap.put(new Emp(3,"d","a3"),"a3");
        empMap.put(new Emp(4,"r","a4"),"a4");
        empMap.put(new Emp(5,"w","a5"),"a5");
        empMap.put(new Emp(6,"b","a6"),"a6");

        empMap.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey().getName())).map(e -> e.getKey()).collect(Collectors.toList()).stream().forEach( s-> { System.out.print(s.getName());});

//System.out.println(s.);
         // Anil,nap,list,bangalore,gap
        //4 = 2
        // 3 = 2
        //

        String[] arr = {"Anil","nap","list","bangalore","gap"};
    List<String> list = new ArrayList<>(Arrays.asList(arr));

        Map<Integer, Long> value = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(value);

    }
}
