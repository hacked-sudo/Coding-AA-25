<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/StackNextSmallerElementToRight.java
package com.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackNextSmallerElementToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] nsElement = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);
        nsElement[arr.length-1] = -1;

        for(int i = arr.length - 2; i >= 0 ;i--){
            //pop
            while(!st.isEmpty() && arr[i] < st.peek()){
                st.pop();
            }
            //value
            if(st.isEmpty()){
                nsElement[i] = -1;
            }else{
                nsElement[i] = st.peek();
            }

            //push
            st.push(arr[i]);

        }

        System.out.println(Arrays.toString(nsElement));



    }
}
=======
package com.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackNextSmallerElementToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] nsElement = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);
        nsElement[arr.length-1] = -1;

        for(int i = arr.length - 2; i >= 0 ;i--){
            //pop
            while(!st.isEmpty() && arr[i] < st.peek()){
                st.pop();
            }
            //value
            if(st.isEmpty()){
                nsElement[i] = -1;
            }else{
                nsElement[i] = st.peek();
            }

            //push
            st.push(arr[i]);

        }

        System.out.println(Arrays.toString(nsElement));



    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/StackNextSmallerElementToRight.java
