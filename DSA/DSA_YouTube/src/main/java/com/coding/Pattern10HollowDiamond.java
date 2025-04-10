package com.coding;

import java.util.Scanner;

public class Pattern10HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int innerSpace = n / 2;
        int outerSpace = -1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= innerSpace; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= outerSpace; j++) {
                System.out.print("\t");
            }
            if (i != 1 && i != n) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                innerSpace--;
                outerSpace += 2;
            } else {
                innerSpace++;
                outerSpace -= 2;
            }
            System.out.println();
        }
    }
}
