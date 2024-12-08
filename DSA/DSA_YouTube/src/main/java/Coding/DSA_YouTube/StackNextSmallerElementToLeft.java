package com.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackNextSmallerElementToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] nsElement = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        nsElement[0]  = 1;
        st.push(arr[0]);

        for(int i = 1; i < arr.length; i++){
            //pop
            while(st.size() > 0 && arr[i] < st.peek()){
                st.pop();
            }

            //value
                if(st.isEmpty()){
                   nsElement[i] = -1;
                } else {
                   nsElement[i] = st.peek();
                }

            //push
                st.push(arr[i]);

        }
        System.out.println(Arrays.toString(nsElement));

    }
}
