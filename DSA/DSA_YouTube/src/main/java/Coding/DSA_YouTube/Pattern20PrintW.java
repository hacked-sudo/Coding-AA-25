package com.coding;

import java.util.Scanner;

public class Pattern20PrintW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > n / 2 && (i + j == n + 1 || i == j)) {
                    System.out.print("*\t");
                }else if (j == 1 || j == n) {
                    System.out.print("*\t");

                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
