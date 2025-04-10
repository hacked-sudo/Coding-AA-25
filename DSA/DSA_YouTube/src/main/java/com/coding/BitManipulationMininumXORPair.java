package com.coding;

import java.util.*;

public class BitManipulationMininumXORPair {
    public static void main(String[] args) {

        int arr[] = {4, 2, 0, 5, 7};
        Arrays.sort(arr);

        int minValue = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < arr.length-1; i++){
            int minXor = arr[i] ^ arr[i+1];
            System.out.println( arr[i] + "," + arr[i+1] + "," + minXor);

            if(minXor < minValue) {
                minValue = minXor;
                result = new ArrayList<>();
                result.add(arr[i] + ", " + arr[i + 1]);

            } else if(minXor == minValue){ // Clear out previously stored pairs with higher XOR values.
                result.add(arr[i] + ", " + arr[i+1]);
            }
        }

        for(String val : result){
            System.out.println(val);
        }
    }
}
