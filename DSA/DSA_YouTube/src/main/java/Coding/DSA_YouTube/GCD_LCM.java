package com.coding;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //24
        int n2 = sc.nextInt(); //36
        int original_n1 = n1;
        int original_n2 = n2;

        while (n1 % n2 != 0) { // doesn't matter if n1 > n2 or vice versa
            int rem = n1 % n2;

            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        System.out.println("GCD : " + gcd);

        int lcm = (original_n1 * original_n2) / gcd; //remember this formula
        System.out.println("LCM : " + lcm);
    }
}
