package com.coding;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapterPopEfficient {
    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter(){
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size(){
            return mainQ.size();
        }
        // Only this operation has n complexity, trade off to make pop efficient
        void push(int val){
            while(mainQ.size() > 0){
                helperQ.add(mainQ.remove());
            }

            mainQ.add(val);

            while(helperQ.size() > 0){
                mainQ.add(helperQ.remove());
            }
        }

        int pop(){
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            } else {
                return mainQ.remove();
            }
        }

        int top(){
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            } else {
                return mainQ.peek();
            }
        }
    }
    public static void main(String[] args) {

    }
}
