package com.coding;

public class BitManipulationFindUnqAndDuplicateAmong1ToN {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 5, 6};

        int totalArrayXOR = 0;

        for(int i = 0; i < arr.length; i++){
           totalArrayXOR ^= arr[i];
        }
        for(int i = 1; i <= arr.length; i++){
            totalArrayXOR ^= i;
        }

        int x_xor = 0;
        int y_xor = 0;

        int rsb = totalArrayXOR & -totalArrayXOR;

        for(int val : arr){
            if((rsb & val) == 0){ // off bit set
                x_xor ^= val;
            }else{
                y_xor ^= val;
            }
        }

        for(int i = 1; i <= arr.length; i++){
            if((rsb & i) == 0){ // off bit set
                x_xor ^= i;
            }else{
                y_xor ^= i;
            }
        }

        System.out.println(x_xor);
        System.out.println(y_xor);
    }
}
