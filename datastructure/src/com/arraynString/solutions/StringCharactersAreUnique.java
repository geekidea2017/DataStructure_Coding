package com.arraynString.solutions;

import java.util.HashSet;
import java.util.Set;

public class StringCharactersAreUnique {

    public String checkStringCharacterIsUniqueOrNot(String stringToCheck){
        if(stringToCheck.length() > 128){
            return "No Unique Characters 128";
        }
        Set<Integer> s = new HashSet<Integer>();
        boolean b = stringToCheck.chars().allMatch(s::add);
        if(b){
            return "Unique";
        }else  return "No Unique Characters";

    }

    public static void main(String[] args){
        StringCharactersAreUnique stringCharactersAreUnique = new StringCharactersAreUnique();

        System.out.println(stringCharactersAreUnique.checkStringCharacterIsUniqueOrNot("ABCD"));
        System.out.println(stringCharactersAreUnique.checkStringCharacterIsUniqueOrNot("hfejdhsdjfhsdsfjhew[uurbnvb[doufkbcsddcoihfdsjbvchbfvdsivc jbnvipsdghbvdspihb cshbd fpdhsfbvdsj khbvsdnbvds vdsphbdsjn ds dhbfdsjfhdvdsshvbvds"));
        System.out.println(stringCharactersAreUnique.checkStringCharacterIsUniqueOrNot("abcd"));
    }
}
