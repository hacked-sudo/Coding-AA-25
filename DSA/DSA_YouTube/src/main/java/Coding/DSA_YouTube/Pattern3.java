package com.coding;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int starCount = 1;
        int spaceCount = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= starCount; k++) {
                System.out.print("*\t");
            }
            starCount++;
            spaceCount--;
            System.out.println();
        }
    }
}

