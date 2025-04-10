package com.coding;

import java.util.Stack;

public class StackFindCelebrity {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 0, 0}
        };

        //stack approach
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < matrix.length; i++){
            st.push(i);
        }

        while(st.size() >= 2){
           int i = st.pop();
           int j = st.pop();

           if(knows(matrix, i,j)){
               st.push(j);
           } else {
               st.push(i);
           }

        }
           int potentialCandidate = st.pop();

             for(int j = 0; j < matrix[0].length; j++){
                 if(j != potentialCandidate) {
                     if (knows(matrix, potentialCandidate, j) || !knows(matrix, j, potentialCandidate)) {
                         System.out.println("No Celebrity Exists");
                         return;
                     }
                 }
        }

             System.out.println(potentialCandidate);



    }

    //helper function
    public static boolean knows(int[][] arr, int i, int j){
        return arr[i][j] == 1;
    }


}
