package com.coding;

public class BitManipulationTwoUniqueRestTwice {
    public static void main(String[] args) {
        int[] arr = {36, 50, 24, 56, 36, 24, 42, 50};

        int xor = 0;

        for(int value : arr){
            xor ^= value;
        }

        int rsb = xor & -xor;
        int unq_num1 = 0;
        int unq_num2 = 0;
        for(int set : arr){
            if((rsb & set) == 0){
                unq_num1 ^= set;
            }else{
                unq_num2 ^= set;
            }
        }
        if(unq_num1 < unq_num2){
            System.out.println(unq_num1);
            System.out.println(unq_num2);
        }else {
            System.out.println(unq_num2);
            System.out.println(unq_num1);
        }
    }
}
