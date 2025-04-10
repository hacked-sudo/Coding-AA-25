package com.coding;

import java.util.LinkedList;

public class LinkedListToStackAdapter {
    public static class LLToStackAdapter{
        LinkedList<Integer> list;
        // Every Operation is in O(1)
        public LLToStackAdapter(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size();
        }

        void push(int val){
            list.addFirst(val);
        }

        int pop(){
           return list.removeFirst();
        }

        int top(){
            return list.getFirst(); // can be implemented with first function combo or last functino combo
        }


    }
    public static void main(String[] args){
        LLToStackAdapter stack = new LLToStackAdapter();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
    }
}
