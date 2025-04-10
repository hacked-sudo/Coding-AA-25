package com.coding.StriverSDESheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class nextPermutationOptimization {
    public static List<Integer> nextGreatorPermutation(List<Integer> A){
        int n = A.size();
        int index = -1;

        // finding a breaking point
        for(int i = n - 2; i >= 0; i--){
            if(A.get(i) < A.get(i + 1)){
                index = i;
                break;
            }
        }

        //finding the next greator element after index to swap
        for(int i = n - 1; i > index; i--){
            if(A.get(i) > A.get(index)){
                int temp = A.get(i);
                A.set(i,A.get(index));
                A.set(index, temp);
                break;
            }
        }


        // reversing so that it is in ascending order and it is nearest dictionary word
        List<Integer> sublist = A.subList(index + 1, n);
        Collections.reverse(sublist);

        return A;
    }


    public static void main(String[] args) {
       List<Integer> A = Arrays.asList(new Integer [] {2, 1, 5, 4, 3, 0, 0});

        List<Integer> ans = nextGreatorPermutation(A);

        System.out.println("Permutation is not present");

        System.out.print("The next permutation is: [");

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");




    }
}
