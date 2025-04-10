package com.coding;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapterPushEfficient {
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

        void push(int val){
            mainQ.add(val);
        }

        int pop(){
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            } else {
                while(size() > 1){
                    helperQ.add(mainQ.remove());
                }

                int val = mainQ.remove();

                while(helperQ.size() > 0){
                    mainQ.add(helperQ.remove());
                }
                return val;

            }
        }

        int top(){
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            } else {
              while(size() > 1){
                  helperQ.add(mainQ.remove());
              }

              int val = mainQ.remove();
              mainQ.add(val);

              while(helperQ.size() > 0){
                  mainQ.add(helperQ.remove());
              }
              return val;
            }
        }
    }
    public static void main(String[] args) {

    }
}
