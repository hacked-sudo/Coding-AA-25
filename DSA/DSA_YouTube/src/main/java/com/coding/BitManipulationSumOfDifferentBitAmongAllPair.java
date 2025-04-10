package com.coding;

public class BitManipulationSumOfDifferentBitAmongAllPair {
    public static void main(String[] args) {
        int arr[] = {20,32,14,19};

        int count = BruteForce(arr);

        System.out.println(count);

        optimal_Oof32N(arr);
    }

    private static void optimal_Oof32N(int[] arr) {
        int counter = 0;
        for(int i = 0; i < 32; i++){
            int countOn = 0;
            for (int value : arr){
                if((value & (1 << i)) != 0){
                    countOn++;
                }
            }
            int countOff = arr.length - countOn;
            int differentCombination = countOff * countOn * 2;
            counter += differentCombination;
        }

        System.out.println("counter " + counter);
    }

    private static int BruteForce(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                 int value = arr[i] ^ arr[j];

                 while(value != 0){
                     int rsb = value & -value;
                     value -= rsb;
                     count++;
                 }


            }
        }
        return count;
    }
}
