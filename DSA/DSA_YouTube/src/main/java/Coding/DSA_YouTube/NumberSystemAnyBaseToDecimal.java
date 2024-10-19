package com.coding;

import java.util.Scanner;

public class NumberSystemAnyBaseToDecimal {
     public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int number = scn.nextInt();
            int numberOnBase = scn.nextInt();

            int power = 0;
            int convertedDecimalNum = 0;

            while(number != 0){
                int rem = number % 10;
                int baseMuliplier = (int)Math.pow(numberOnBase,power);

                convertedDecimalNum += (rem*baseMuliplier);

                power++;
                number = number / 10;
            }
            System.out.println(convertedDecimalNum);
        }
    }
