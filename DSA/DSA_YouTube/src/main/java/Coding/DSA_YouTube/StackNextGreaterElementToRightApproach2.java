package com.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackNextGreaterElementToRightApproach2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ngElement = new int[n];

            for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //index Approach
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            //pop and value
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                int pos = st.peek();
                ngElement[pos] = arr[i];
                st.pop();
            }
            //push
            st.push(i);
        }

        while(!st.isEmpty()){
            int position = st.peek();
            ngElement[position] = -1;
            st.pop();
        }

        System.out.println(Arrays.toString(ngElement));

    }
}
