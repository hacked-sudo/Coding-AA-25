package com.coding;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > maxHeight) {
                maxHeight = arr[i];
            }
        }
        System.out.println("Calling (Floor Building) Approach ");


        for(int floor = maxHeight; floor >= 1; floor--){
            for(int j = 0; j < arr.length; j++){
                if(floor <= arr[j]){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        int[] spaceArr = arr;
        for (int i = 0; i < n; i++) {
            spaceArr[i] = maxHeight - spaceArr[i];
        }
        System.out.println("maxHeight : " + maxHeight);

        System.out.println(Arrays.toString(spaceArr));
        System.out.println(spaceArr);
        System.out.println("Calling My Approach ");
        for (int k = 0; k < maxHeight; k++) {
            for (int i = 0; i < spaceArr.length; i++) {
                if (spaceArr[i] == 0) {
                    System.out.print("*\t");
                } else {
                    spaceArr[i]--;
                    System.out.print("\t");
                }
            }
            System.out.println();
        }





    }
}
