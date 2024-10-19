package com.coding;
import java.util.*;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int UserNum = scn.nextInt(); //15234 -> 41235
        int inverseNum = 0;
        int count = 0;
        while(UserNum != 0){
            count++;
            int digit = UserNum % 10;
            int multiplier = (int)Math.pow(10,digit-1);
            int n = count * multiplier;
            inverseNum += n;
            UserNum = UserNum / 10;
            System.out.println(UserNum);
        }

        System.out.println(inverseNum);



    }



}
