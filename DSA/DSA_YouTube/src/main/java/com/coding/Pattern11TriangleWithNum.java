package com.coding;

import java.util.Scanner;

public class Pattern11TriangleWithNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + "\t");
                counter++;
            }
            System.out.println();
        }
    }
}
