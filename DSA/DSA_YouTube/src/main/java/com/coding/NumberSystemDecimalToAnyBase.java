package com.coding;

import java.util.Scanner;

public class NumberSystemDecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();

        int power = 0;
        int convertedNum = 0;

        while(number != 0){
            int rem = number % base;
            int baseMuliplier = (int)Math.pow(10,power);

            convertedNum = convertedNum + (rem*baseMuliplier);

            power++;
            number = number / base;
        }
        System.out.println(convertedNum);
    }
}
