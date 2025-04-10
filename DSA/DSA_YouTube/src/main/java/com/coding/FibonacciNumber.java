package com.coding;
import java.util.*;

public class FibonacciNumber
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        fibonacci2(num);
    }

    private static void fibonacci_FirstTry(int num) {


        if(num == 1){
            System.out.println(0);
            return;
        } else if(num == 2) {
            System.out.println(0 + " " + 1);
            return;
        } else {
            int first = 0;
            int second = 1;

            for(int i = 0; i < num; i++){
                if (i == 0){
                    System.out.print(i + " ");
                } else {
                    int fibNum = first + second;
                    System.out.print(fibNum + " ");

                    first = second;
                    second =  fibNum;

                }
            }

        }
    }

    public static void fibonacci(int number){
        int first = 0;
        int second = 1;

        for(int i = 0; i < number; i++){
            System.out.print(first +  " ");
            int third = first + second;
            first = second;
            second = third;
        }
    }
    public static void fibonacci2(int number){
        int first = 0;
        int second = 1;

        for(int i = 0; i < number; i++){
            System.out.print(first +  " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}
