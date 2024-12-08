package com.coding;

import java.util.Scanner;
import java.util.Stack;

public class StackNextGreaterElementToRightApproach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /*To Find Next Greator Element To Right -> Start From Right go to Left and pop Smaller Element to find greator
        Follow this concept to find NSE on right, NSE to Left and etc. the very first entry in nge or nse array should be -1 think like that*/
        Stack<Integer> st = new Stack<>();
        int[] ngeTR = new int[arr.length];
        ngeTR[arr.length-1] = -1;
        st.push(arr[arr.length-1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            System.out.println(st);
            //poping smaller element
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            //value
            if (st.isEmpty()) {
                ngeTR[i] = -1;
            } else {
                ngeTR[i] = st.peek();
            }
            //push
            st.push(arr[i]);
        }

        for(int i = 0; i < ngeTR.length; i++){
            System.out.print(ngeTR[i] + " ");
        }


    }
}
