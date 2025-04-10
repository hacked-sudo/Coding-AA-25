package com.coding;

public class BitManipulationXORofSubQueries {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 8};
        int[][] queries = new int[][]{
                {0, 1},
                {1, 2},
                {0, 3},
                {3, 3}};

//        BruteForce(queries, arr);

        //Optimal Approach using prefix sum array

        int[] prefixXor = new int[arr.length];
        prefixXor[0] = arr[0];


        for(int i = 1; i < arr.length; i++){
            prefixXor[i] = prefixXor[i-1] ^ arr[i];
        }

        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int xor = 0;
            if(left == 0){
                 xor = prefixXor[right];
            } else{
                 xor = prefixXor[right] ^ prefixXor[left-1];
            }
            System.out.println(xor);
        }



    }

    private static void BruteForce(int[][] queries, int[] arr) {
        //BruteForce Approach

        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int xor = 0;
            for(int j = left; j <= right; j++){
                xor ^= arr[j];
            }
            System.out.println(xor);
        }
    }
}
