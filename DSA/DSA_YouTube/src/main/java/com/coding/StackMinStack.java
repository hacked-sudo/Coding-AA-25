package com.coding;

import java.util.Stack;

public class StackMinStack {
    public static class MinStack {
        //The Space is n complexity
        Stack<Integer> allData;
        Stack<Integer> minData;

        public MinStack() {
            allData = new Stack<>();
            minData = new Stack<>();
        }

        int size() {
            return allData.size();
        }

        void push(int val) {
            if (allData.isEmpty() && minData.isEmpty()) {
                allData.push(val);
                minData.push(val);
                return;
            }
            allData.push(val);
            int minValue = minData.peek();
            if (val < minValue) {
                minData.push(val);
            }
        }

        void pop() {
            int val1 = allData.peek();
            int val2 = minData.peek();
            if (val1 == val2) {
                allData.pop();
                minData.pop();
                return;
            }
            allData.pop();
        }

        int top() {
            if (minData.size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return allData.peek();
        }

        int min() {
            if (minData.size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return minData.peek();
        }
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(10);
        ms.push(20);
        ms.push(30);
        ms.push(2);
        ms.push(50);
        System.out.println(ms.min());
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();
        System.out.println(ms.min());


    }
}

