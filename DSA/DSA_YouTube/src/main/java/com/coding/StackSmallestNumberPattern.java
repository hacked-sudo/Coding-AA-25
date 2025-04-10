package com.coding;

import java.util.Stack;

public class StackSmallestNumberPattern {
    public static void main(String[] args) {
//        String s = "dddiddd";
        String s = "ddidddid";
        int num = 1;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'd'){
                st.push(num);
                num++;
            }else{
                st.push(num);
                num++;

                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
            }
        }

        st.push(num);

        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
