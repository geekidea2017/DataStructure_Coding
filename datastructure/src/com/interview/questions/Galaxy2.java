package com.interview.questions;

/*public class Person {
    private String id;
    private String name;
    private List<Address> addresses;

    // getters and setters
}


public class Address {
    private String name;
    private String city;
    private String zipCode;
    // getters and setters
}*/



/*List of Persons is given write a program for the following requirement to output the array of person names
 *
 *  Input -> List of persons, Output -> Array of Person names
 *
 *  1. Remove all duplicate Persons objects
 *  2. Sort Persons by their name in descending order
 *  3. Extract only 3 Persons whose address in city 'New York' or Person name contains 'John'
 *  4. Get Person name in UPPER CASE
 *
 *  Free to add all necessary code changes to fulfil the above requirement.
 *
 */
import java.util.*;
import java.util.stream.Collectors;

public class Galaxy2 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("1", "John Doe", Arrays.asList(new Address("Home", "New York", "10001"))),
                new Person("2", "Jane Smith", Arrays.asList(new Address("Office", "Los Angeles", "90001"))),
                new Person("3", "John Smith", Arrays.asList(new Address("Home", "New York", "10002"))),
                new Person("4", "Alice Johnson", Arrays.asList(new Address("Home", "Chicago", "60601"))),
                new Person("5", "Bob Brown", Arrays.asList(new Address("Home", "New York", "10003"))),
                new Person("1", "John Doe", Arrays.asList(new Address("Home", "New York", "10001"))) // Duplicate
        );

        // 1. Remove all duplicate Person objects
        Set<Person> uniquePersons = new HashSet<>(persons);

        // 2. Sort Persons by their name in descending order
        List<Person> sortedPersons = uniquePersons.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .collect(Collectors.toList());

        // 3. Extract only 3 Persons whose address is in city 'New York' or Person name contains 'John'
        List<Person> filteredPersons = sortedPersons.stream()
                .filter(p -> p.getAddresses().stream().anyMatch(a -> "New York".equals(a.getCity())) || p.getName().contains("John"))
                .limit(3)
                .collect(Collectors.toList());

        // 4. Get Person name in UPPER CASE
        List<String> personNames = filteredPersons.stream()
                .map(p -> p.getName().toUpperCase())
                .collect(Collectors.toList());

        // Output the array of person names
        System.out.println(personNames);
    }
}

class Person {
    private String id;
    private String name;
    private List<Address> addresses;

    public Person(String id, String name, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class Address {
    private String name;
    private String city;
    private String zipCode;

    public Address(String name, String city, String zipCode) {
        this.name = name;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }
}

