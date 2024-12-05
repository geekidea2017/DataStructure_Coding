package com.leetcode75.solutions.easy.array_String;

import java.util.*;

/*
* 1431. Kids With the Greatest Number of Candies
*
* There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.



Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]


Constraints:

n == candies.length
2 <= n <= 100
1 <= candies[i] <= 100
1 <= extraCandies <= 50
*
* */
public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int maxValue = 0;
        for(int i=0;i<candies.length;i++){
            if(maxValue < candies[i]){
                maxValue = candies[i];
            }

        }
       // OptionalInt maxValue = Arrays.stream(candies).max();

       // int value = maxValue.isPresent() ? maxValue.getAsInt() : 0;
        for(int i=0; i< candies.length;i++){
            if((candies[i] + extraCandies) >= maxValue){
                list.add(true);
            }else{
                list.add(false);
            }
        }


        return maxValue == 0 ? new ArrayList() : list;
    }

    // Java 8 Stream implementation

    public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int maxValue = 0;

        maxValue = Arrays.stream(candies).max().getAsInt();

        int finalMaxValue = maxValue;
        

        return maxValue == 0 ? new ArrayList() : list;
    }

    public static void main(String[] args){
        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));

         candies = new int[]{4,2,1,1,2};
         extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));

        candies = new int[]{12,1,12};
        extraCandies = 10;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
