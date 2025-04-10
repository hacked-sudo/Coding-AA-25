package com.coding.StriverSDESheet;

import java.util.*;


public class nextPermutation {
    public static void recursePermutation(int index, int[] nums, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> ls = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                ls.add(nums[i]);
            }
            ans.add(ls);
            return;
        }

        for(int i = index; i < nums.length; i++){
            swap(nums, i, index);
            recursePermutation(index + 1, nums,ans);
            swap(nums, i, index);

        }
    }

    public static void swap(int[] nums, int i, int index){
               int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
    public static List<List<Integer>> permutaionArray(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        recursePermutation(0, nums, ans);

        for(List<Integer> elemRow : ans){
            for(Integer ele : elemRow){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        return ans;
    }

    public static int findPermutationTarget(List<List<Integer>> permutation, List<Integer> target){
        for(int i = 0; i < permutation.size(); i++){
            if(permutation.get(i).equals(target)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> permutation = permutaionArray(nums);
        List<Integer> target = new ArrayList<>(Arrays.asList(3,2,1));
        int index = findPermutationTarget(permutation, target);
        System.out.println("Finding next lexicographically set");
        if (index == permutation.size() - 1){
            System.out.println(permutation.get(0));
        } else if (index == -1){
            System.out.println("Permutation is not present");
        } else {
            System.out.println(permutation.get(index+1));
        }



    }
}
