package com.coding;

public class BitManipulationBinaryStringDivisibleBy3 {
    public static void main(String[] args) {
        String binaryInput  = "111010";

        int odd = 0;
        int even = 0;

        for(int i = 0; i < binaryInput.length(); i++){
            int bit = binaryInput.charAt(i) - '0';

            if(i % 2 == 0){
                even += bit; // 0 = 48 in ASCII
            }else{
                odd += bit;
            }

        }

        int delta = even - odd;
        if(delta % 11 == 0){
            System.out.println("delta " + delta + " true");
        }else{
            System.out.println("delta " + delta + " false");
        }



    }
}
