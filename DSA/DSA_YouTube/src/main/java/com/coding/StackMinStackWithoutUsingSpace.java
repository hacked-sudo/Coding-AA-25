package com.coding;

import java.util.Stack;

public class StackMinStackWithoutUsingSpace {
    public static class MinStack {
        Stack<Integer> stack;
        int min;

        public MinStack(){
            stack = new Stack<>();
        }

        int size(){
            return stack.size();
        }

        void push(int val){
            if(stack.size() == 0){
                min = val;
                stack.push(val);
            }else{
                if(val >= min){
                    stack.push(val);
                }else{
                    min = val;
                    stack.push(2*val - min);
                }
            }
        }

        void pop(){
            if(stack.size() == 0){
                System.out.println("Stack Underflow");
            } else {
                if(stack.peek() >= min){
                    stack.pop();
                }else{
                    min = 2*min - stack.peek();
                    stack.pop();
                }
            }
        }
        int top(){
            if(stack.size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            } else {
                if(stack.peek() >= min){
                    return stack.peek();
                } else{
                    return min;
                }
            }
        }
        int min(){
           if(stack.size() == 0){
               System.out.println("Stack Underflow");
               return -1;
           } else {
               return min;
           }
        }
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(8);
        st.push(47);
        st.push(17);
        System.out.println(st.min());
        st.push(7);
        System.out.println(st.min());
        st.push(30);
        st.push(2);
        System.out.println(st.min());
    }
}
