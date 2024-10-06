package com.coding;

import java.util.*;

public class PrintDigitFromLeft {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int userNum = scn.nextInt();
        int tempNum = userNum;
        int count = 0;
        while (tempNum != 0) {
            count++;
            tempNum = tempNum / 10;
        }

//        System.out.println(count);
        int tenNum = (int)Math.pow(10,count-1);
//        System.out.println(tenNum);

        while(tenNum != 0){
            int rem = userNum % tenNum;
            int quotient = userNum / tenNum;
            System.out.println(quotient);
            userNum = rem;
            tenNum = tenNum / 10;
        }
    }
}
