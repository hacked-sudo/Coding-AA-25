package com.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackLargestAreaHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /* If the "next" element is to the right, traverse the array right to left.
        If the "next" element is to the left, traverse the array left to right.*/

        int[] rightBoundary = new int[n]; //nse to right, run loop from right to left
        int[] leftBoundadry = new int[n]; //nse to left, run loop from left to right

        Stack<Integer> st = new Stack<>();
        //from right to left
        st.push(arr.length-1);

        rightBoundary[arr.length-1]  = -1;

        for(int i = arr.length-2; i >=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                rightBoundary[i] = arr.length;
            }else{
                rightBoundary[i] = st.peek();
            }
            st.push(i);
        }


        st = new Stack<>();
        //from right to left
        st.push(0);
        leftBoundadry[0]  = -1;

        for(int i = 1; i < arr.length ; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                leftBoundadry[i] = -1;
            }else{
                leftBoundadry[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;

        for(int i = 0; i < arr.length; i++){
            int width = rightBoundary[i] - leftBoundadry[i] -1;
            int area = arr[i] * width;

            if(area > maxArea){
                maxArea = area;
            }

        }
        System.out.println(maxArea);


    }
}
