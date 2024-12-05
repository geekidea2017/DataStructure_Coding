package com.leetcode75.solutions.easy.array_String;

public class MaximumAvgSubArray1 {
    public static void main(String[] args) {
        MaximumAvgSubArray1 maximumAvgSubArray1 = new MaximumAvgSubArray1();
        int[] input = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("before :" );
        System.out.println("After : "+ maximumAvgSubArray1.findMaxAverage(input,k)); // 12.75000
    }
    public double findMaxAverage(int[] nums, int k) {
        int j = 0;
        double maxValue=0.0;
        double maxValueAvg = 0.0;
        for(int i=0; i< k; i++){
                maxValue +=  nums[i];
        }
        maxValueAvg = maxValue / k ;
        for(int i=k;i<nums.length;i++){

            maxValue = maxValue + nums[i];
            maxValue = maxValue - nums[j];
            maxValueAvg = Math.max((maxValue/k),maxValueAvg);
            j++;
        }
        return maxValueAvg;
    }
}
