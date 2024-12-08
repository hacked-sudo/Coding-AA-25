package com.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackStockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<Integer>();

        st.push(0);
        span[0] = 1;

        for(int i = 1; i < arr.length; i++){
            //pop untill you find peek index which is greator then array itself and fix value
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i + 1;
            }else{
                span[i] = i - st.peek();
            }
            //push
            st.push(i);
        }



        System.out.println(Arrays.toString(span));


    }
}
