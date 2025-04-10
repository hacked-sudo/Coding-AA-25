package com.coding;

public class Stack_FixedSizeCustomStack {
    public static class CustomStack{
        int[] data;
        int topOfStack;

        public CustomStack(int size){
            data = new int[size];
            topOfStack = -1;
        }

        int size(){
            return topOfStack + 1;
        }

        void dispaly(){
            for(int i = topOfStack; i >= 0; i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
/* This push is for static size stack
        void push(int val){
            if(topOfStack == data.length - 1){
                System.out.println("Stack OverFlow");
            } else{
                topOfStack++;
                data[topOfStack] = val;
            }
        }

 */
// for dynamic size stack

        void push(int val){
            if(topOfStack == data.length - 1){
                int[] arr = new int[2 * data.length];

                for(int i = 0; i <= topOfStack; i++){
                    arr[i] = data[i];
                }

                data = arr;
                topOfStack++;
                data[topOfStack] = val;
            } else{
                topOfStack++;
                data[topOfStack] = val;
            }
        }
        int pop(){
            if(topOfStack == -1){
                System.out.println("Stack Underflow");
                return -1;
            }else {
                 int topValue = data[topOfStack];
                topOfStack--;
                return topValue;
            }
        }

        int top(){
            if(topOfStack == -1){
                System.out.println("Stack Underflow");
                return -1;
            }else {
                return data[topOfStack];
            }

        }
    }


    public static void main(String[] args) {
        CustomStack cs = new CustomStack(5);
        cs.push(10);
        cs.push(20);
        System.out.println(cs.top());
        cs.push(30);
        cs.push(40);
        cs.push(50);
        cs.push(60);
        cs.push(70);

        cs.dispaly();
        cs.pop();
        cs.push(77);
        cs.push(88);
        cs.dispaly();
        System.out.println(cs.size());
        cs.pop();cs.pop();cs.pop();cs.pop();
        cs.dispaly();

        cs.pop(); cs.pop();

    }
}


