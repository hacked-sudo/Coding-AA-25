package com.coding.Leetcode.Array;

public class LargestNumberAtleastTwiceOfOther {
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};


        int indexOfMax = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                indexOfMax = i;
            }
        }

        System.out.println("indexOfMax = " + indexOfMax);
        
        for(int element : nums){
            if(element != max && (2 * element > max)){
                System.out.println("output = " + -1);
                return;
            }
        }

        System.out.println("indexOfMax = " + indexOfMax);
    }
}
