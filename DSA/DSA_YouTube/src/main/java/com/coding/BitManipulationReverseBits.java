package com.coding;

public class BitManipulationReverseBits {
    public static void main(String[] args) {
        int n = 11;
        boolean foundFirstSetBit = false;
        int reverse = 0;
        int j = 0;

        for(int i = 31; i >= 0; i--){
            int mask = 1 << i;
            if(foundFirstSetBit == false){
                if((n & mask) != 0){
                    //if found first on bit in n
                    foundFirstSetBit = true;
                    System.out.print(1);

                    int revMask = 1 << j;
                    reverse |= revMask;
                    j++;
                }
            } else {
                if((n & mask) != 0){
                    System.out.print(1);
                    int revMask = 1 << j;
                    reverse |= revMask;
                } else{
                    System.out.print(0);
                }
                j++;
            }
        }

        System.out.println( "\n" + reverse);
    }
}
