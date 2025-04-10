package com.coding;

import java.util.Scanner;
import java.util.Stack;

public class StackSlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int[] ngR = new int[arr.length];

        st.push(arr.length-1);
        ngR[arr.length-1] = arr.length; //equals to infinity

        for(int i = arr.length-2; i >= 0 ; i--){
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                ngR[i] = arr.length;
            } else {
                ngR[i] = st.peek();
            }
            st.push(i);
        }

        for(int i = 0; i <= arr.length-k; i++){

            int j = i;

            while(ngR[j] < i+k){
                j = ngR[j];
            }

            System.out.println(arr[j]);
        }


    }
}

//input
//        4
//        17
//        2
//        9
//        3
//        8
//        1
//        7
//        12
//        6
//        14
//        4
//        32
//        0
//        7
//        19
//        8
//        12
//        6
