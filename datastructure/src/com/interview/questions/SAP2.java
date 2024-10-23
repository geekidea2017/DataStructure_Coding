/*
package com.interview.questions;

import java.util.Arrays;
import java.util.Objects;

public class SAP2 {

    public static void main(String... args){

      */
/* *//*
*/
/* Input: {0, 1, 2, 0, 1, 2, 2, 1}
        Output: {0, 0, 1, 1, 1, 2, 2, 2}*//*
*/
/*

        int[] input = {0, 1, 2, 0, 1, 2, 2, 1};

        int[] output ;
        for(int i=0, j= i+1; i< input.length; i++, j++){

                if(input[j] < input[i] ){
                    int swap = input[j];
                    input[j] = input[i];
                    input[i] = swap;

                }


        }
        for(int i=0; i< input.length; i++){
            System.out.print(input[i]);
        }
*//*


        Persons person = new Person();


    }
}


class final Persons {

    private final Integer id;
    private final String name;
    private final Integer age;

    public Persons(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons = (Persons) o;
        return Objects.equals(id, persons.id) &&
                Objects.equals(name, persons.name) &&
                Objects.equals(age, persons.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }



    static final class SingletonPersons implements Cloneable{

        private volatile SingletonPersons singletonPersons = null;
        private  Integer id;
        private  String name;
        private  Integer age;

        private SingletonPersons() {}

        public static SingletonPersons factory( SingletonPersons singletonPersons){

            if(singletonPersons == null){

                synchronized (SingletonPersons.class){
                    if(singletonPersons == null){
                        singletonPersons = new SingletonPersons();
                    }
                }

            }
            return singletonPersons;
        }
       @Override
        public CloneNotSupportedException clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException("SingletonPersons.class");
       }
    }
     */
/*   @Override
        public String toString() {
            return "Persons{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            com.interview.questions.Persons persons = (com.interview.questions.Persons) o;
            return Objects.equals(id, persons.id) &&
                    Objects.equals(name, persons.name) &&
                    Objects.equals(age, persons.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, age);
        }*//*

}*/
