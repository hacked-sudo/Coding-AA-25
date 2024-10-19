package com.coding;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rotateBy = sc.nextInt();
        int num = sc.nextInt(); //12345 => 2 => 45123
        int tempNum = num;
        int tempRotateBy = rotateBy;
        int count = 0;

        while (tempNum != 0) {
            count++;
            tempNum = tempNum / 10;
        }
        int rotatedNum = 0;
        int mulitiplier = (int) Math.pow(10, count - 1);
        while (tempRotateBy != 0) {
            tempRotateBy--;
            int rem = num % 10;
            rem = rem * mulitiplier;
            num = num / 10;
            mulitiplier = mulitiplier / 10;
            rotatedNum = rotatedNum + rem;
            System.out.println("rotatedNum " + rotatedNum);

        }
        rotatedNum += num;
        System.out.println("rotatedNum " + rotatedNum);


    }
}
