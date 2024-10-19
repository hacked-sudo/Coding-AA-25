package com.coding;

import java.util.*;

public class PrimeNumber {
    public static void main(String... arg) {
        try {
            Scanner scn = new Scanner(System.in);
            int userLoopInput = scn.nextInt();

            for (int i = 0; i < userLoopInput; i++) {
                int numberInput = scn.nextInt();
                System.out.println(isPrimeSquarRootMethod(numberInput));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String isPrime(int numberInput) {
        for (int i = 2; i < numberInput; i++) {
            System.out.println("numberInput = " + i);
            if (numberInput % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static String isPrimeSquarRootMethod(int numberInput){
        for(int i = 2; i*i <= numberInput; i++){
            System.out.println("numberInput = " + i);
            if(numberInput % i == 0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
