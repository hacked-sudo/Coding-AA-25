package com.coding.Leetcode.Array;

import java.sql.SQLOutput;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int size = nums.length;

        for (int index = 0; index < size; index++) {

            int leftSum = 0;
            for (int left = 0; left < index; left++) {
                leftSum += nums[left];
            }

            int rightSum = 0;
            for (int right = index + 1; right < size; right++) {
                rightSum += nums[right];
            }

            if (leftSum == rightSum) {
                System.out.println("index = " + index);
                return;
            }
        }
        System.out.println("index = " + -1);
        optimized();
    }

    public static void optimized(){
        int[] nums = {1, 2, 3};
        int size = nums.length;
        int totalSum = 0;

        for(int element : nums){
            totalSum += element;
        }

        int leftSum = 0;
        for(int index = 0; index < size; index++){
            if(leftSum == totalSum - leftSum- nums[index]){
                System.out.println("index = " + index);
                return;
            }
        }
        System.out.println("index = " + -1);
    }
}