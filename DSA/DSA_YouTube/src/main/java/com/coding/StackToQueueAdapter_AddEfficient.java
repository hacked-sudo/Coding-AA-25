package com.coding;

import java.util.Stack;

public class StackToQueueAdapter_AddEfficient {
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
            mainSt.push(val);
        }

        int remove(){
            if(size() == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {

                while(mainSt.size() > 1){
                    helperSt.push(mainSt.pop());
                }

                int val = mainSt.pop();

                while(helperSt.size() > 0){
                    mainSt.push(helperSt.pop());
                }
                return val;
            }
        }

        int peek(){
            if(size() == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {
                while(mainSt.size() > 1){
                    helperSt.push(mainSt.pop());
                }

                int val = mainSt.pop();
                mainSt.push(val);

                while(helperSt.size() > 0){
                    mainSt.push(helperSt.pop());
                }
                return val;
            }
        }
    }
    public static void main(String[] args) {

    }
}
