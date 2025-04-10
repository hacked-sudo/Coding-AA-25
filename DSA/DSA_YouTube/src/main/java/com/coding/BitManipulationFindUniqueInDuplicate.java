package com.coding;

public class BitManipulationFindUniqueInDuplicate {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 4, 4, 3, 12};
        int x_xor = 0;

        for(int value : arr){
            x_xor ^= value;
        }


        System.out.println(x_xor);

    }
}
