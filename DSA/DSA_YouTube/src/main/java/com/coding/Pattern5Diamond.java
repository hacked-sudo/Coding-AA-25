package com.coding;

import java.util.Scanner;

public class Pattern5Diamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n / 2;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (i <= (n / 2) ) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }

        }
    }
}
