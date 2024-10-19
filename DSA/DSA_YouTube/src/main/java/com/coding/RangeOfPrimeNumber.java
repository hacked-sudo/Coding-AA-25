package com.coding;
import java.util.*;

public class RangeOfPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int n = low; n <= high; n++){
            boolean ifPrime = primeUtil(n);
            if(ifPrime){
                System.out.print(n + " ");
            }
        }


    }

    public static boolean primeUtil(int number){
        for(int i = 2; i * i <= number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
