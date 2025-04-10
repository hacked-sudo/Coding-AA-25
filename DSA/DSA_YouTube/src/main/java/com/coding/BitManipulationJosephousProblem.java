package com.coding;

public class BitManipulationJosephousProblem {
    public static void main(String[] args){
        int n = 3;
        int k = 2;

        //Special case of Josephous problem with  k = 2 can only be solved with bitmanupulation with formaula 2L + 1, L is highest power of 2 near n
            System.out.println("highestNumberNear2 " + highestNumberNear2(n));
            int highestNumberNear2 = highestNumberNear2(n);
            int l = n - highestNumberNear2;
            System.out.println("Survivor : " + (2*l+1));

    }

    public static int highestNumberNear2(int n){
        int h = 1;
        while(h * 2 <= n){
            h = h * 2;
        }
        return h;
    }
}
