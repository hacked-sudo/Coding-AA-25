package com.coding;

import java.util.Scanner;
import java.util.Stack;

public class StackBalancedButFindUnnecessaryBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // (a+b)+((c+d))
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            System.out.println("st -> " + st);
            if (ch == ')') {
                if ( !st.isEmpty() && st.peek() == '(') {
                    System.out.println("Found Unnecessay Bracket");
                    return;
                } else {
                    while(!st.isEmpty() && st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println("Balanced and No Duplicate");
    }
}
