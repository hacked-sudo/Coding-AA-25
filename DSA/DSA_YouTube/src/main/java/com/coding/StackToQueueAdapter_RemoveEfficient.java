package com.coding;

import java.util.Stack;

public class StackToQueueAdapter_RemoveEfficient {
    public static class QueueToStackAdapter {
        Stack<Integer> mainSt;
        Stack<Integer> helperSt;

        public QueueToStackAdapter(){
            mainSt = new Stack<>();
            helperSt = new Stack<>();
        }

        int size(){
            return mainSt.size();
        }
        // Only this operation has n complexity, trade off to make pop efficient
        void add(int val){
            while(mainSt.size() > 0){
                helperSt.push(mainSt.pop());
            }

            mainSt.push(val);

            while(helperSt.size() > 0){
                mainSt.push(helperSt.pop());
            }
        }

        int remove(){
            if(size() == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {
                return mainSt.pop();
            }
        }

        int peek(){
            if(size() == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {
                return mainSt.peek();
            }
        }
    }
    public static void main(String[] args) {

    }
}
