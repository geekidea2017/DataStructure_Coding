package com.interview.questions;

//Implement a function that takes a string (e.g., a product name)
// and returns a URL-friendly slug
// (e.g., "This is a Product Name" becomes "this-is-a-product-name").

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class AppExert {

 /*   Special! @#Characters?

    special-characters*/


/*    Café Au Lait

    cafe-au-lait*/


/*    Consecutive     Spaces   and---Special___Characters


    consecutive-spaces-and-special-characters*/


    /*Given a large list of users, write a function that retrieves all users who registered within the last month. Assume each user has a registration date and a unique ID*/
    public static void main(String[] args){

        User u1 = new User();
        u1.setId(1);
        u1.setRegistrationDate(LocalDate.now().minusDays(5));

        User u2 = new User();
        u2.setId(1);
        u2.setRegistrationDate(LocalDate.now().minusDays(1));

        boolean ss = u1.getRegistrationDate().isAfter(LocalDate.now().minusMonths(1));
        
        List<User> list = new ArrayList<User>();

list.add(u1);
        list.add(u2);
        List<User> output = list.stream().filter(r ->  r.getRegistrationDate().isAfter(LocalDate.now().minusMonths(1))).collect(Collectors.toList());

        for(User u : output){
            System.out.println("ID : "+ u.getId() + " registration Date : "+u.getRegistrationDate());
        }
    }

}


class User{
    private LocalDate registrationDate;
    private int id;

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}