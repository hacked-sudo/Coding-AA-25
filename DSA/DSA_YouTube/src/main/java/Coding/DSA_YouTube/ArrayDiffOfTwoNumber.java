package com.coding;

import java.util.Scanner;

public class ArrayDiffOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] firstArr = new int[n1];
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] secondArr = new int[n2]; // assumption second array is always bigger than first
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = sc.nextInt();
        }

        int[] outArr = new int[secondArr.length];
        int i = firstArr.length - 1;
        int j = secondArr.length - 1;
        int k = outArr.length - 1;
        int carry = 0;

        while(k >= 0){
            int digit1 = 0;
            int digit2 = 0;
            int outDigit;

            if (i >= 0){
                digit1 = firstArr[i];
            }
            if (j >= 0){
                digit2 = secondArr[j];
            }
            digit2 += carry;
            if(digit1 <= digit2){
                outDigit = digit2 - digit1;
                carry = 0;
            } else{
                outDigit = 10 + digit2 - digit1;
                carry = -1;
            }
            outArr[k] = outDigit;
            i--;
            j--;
            k--;
            System.out.println("digit " + outDigit);
        }
        int idx = 0;//below logic is for ignoring trailing zeroes and leaving a index when non-zero number is found.
        while (outArr[idx] == 0){
            idx++;
        }
        for (; idx < outArr.length; idx++) {
            System.out.println(outArr[idx]);
        }
    }
}
