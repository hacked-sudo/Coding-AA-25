package com.coding;

import java.util.ArrayDeque;
import java.util.Queue;

public class Stack_TwoStack {
    public static class TwoStack {
        int[] data;
        int topOfStack1;
        int topOfStack2;

        public TwoStack(int capacity){
            data = new int[capacity];
            topOfStack1 = -1;
            topOfStack2 =  data.length;


        }

        int size1(){
            return topOfStack1 + 1;
        }
        int size2(){
            return data.length - topOfStack2;
        }

        void push1(int val){
            if(topOfStack1 + 1 == topOfStack2){
                System.out.println("Stock Overflow");
            } else {
                topOfStack1++;
                data[topOfStack1] = val;
            }
        }
        void push2(int val){
           if(topOfStack2 == topOfStack1 + 1){
                System.out.println("Stock Overflow");
           } else {
               topOfStack2--;
               data[topOfStack2] = val;
           }
        }

        int pop1(){
            if(size1() == 0){
                System.out.println("Stack underflow");
                return -1;
            } else {
                int val = data[topOfStack1];
                topOfStack1--;
                return val;

            }
        }
        int pop2(){
            if(size1() == 0){
                System.out.println("Stack underflow");
                return -1;
            } else {
                int val = data[topOfStack2];
                topOfStack2++;
                return val;

            }
        }

        int top1(){
            if(size1() == 0){
                System.out.println("Stack underflow");
                return -1;
            } else {
                return data[topOfStack1];
            }
        }
        int top2(){
            if(size1() == 0){
                System.out.println("Stack underflow");
                return -1;
            } else {
                return data[topOfStack2];
            }
        }
    }
    public static void main(String[] args) {

    }
}
