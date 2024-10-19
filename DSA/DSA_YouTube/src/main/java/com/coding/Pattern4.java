package com.coding;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int starCount = n;
        int spaceCount = 0;
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= spaceCount; k++){
                System.out.print("\t");
            }
            for(int j = 1; j <= starCount; j++){
                System.out.print("*\t");
            }
            starCount--;
            spaceCount++;
            System.out.println();
        }
    }
}
