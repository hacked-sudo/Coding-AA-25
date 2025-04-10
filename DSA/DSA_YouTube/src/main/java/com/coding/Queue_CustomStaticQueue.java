package com.coding;

public class Queue_CustomStaticQueue {
    public static class CustomQueue{
        int[] data;
        int size;
        int front = 0;

        public CustomQueue(int n){
            data = new int[n];
            size = 0;

        }

        int size(){
            return size;
        }

        void display(){
            for(int i = 0; i < size; i++){
                int idx = (front + i) % data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }

        void add(int value){
            if(size == data.length){
                System.out.println("Queue Overflow");

                int[] newArr = new int[2 * size];
                for(int i = 0; i < newArr.length; i++){
                    int idx = (front + i) % size;
                    newArr[i] = data[idx];
                }
                data = newArr;
                front = 0;
                
                int rear = (front + size) % data.length; // so that it regain its circular when going beyond size
                data[rear] = value;
                size++;
            }else{
                int rear = (front + size) % data.length; // so that it regain its circular when going beyond size
                data[rear] = value;
                size++;
            }
        }

        int remove(){
            if(size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }else{
                int val = data[front ];
                front = (front + 1) % data.length; // same circular nature to keep front circular
                size--;
                return val;
            }
        }

        int peek(){
            if(size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }
            return data[front];
        }
    }
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();

        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.size());


    }
}
