package com.coding.StriverSDESheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2DMatrixSetToZeroOptimalApproach {
    public static void markRow(ArrayList<ArrayList<Integer>> matrix, int m, int i){
        for(int j = 0 ; j < m; j++){
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j, -1);
            }
        }
    }

    public static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int j){
        for(int i = 0 ; i < n; i++){
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j, -1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){

        boolean row = false, col = false;

        for(int i = 0; i < n; i++){
            if(matrix.get(i).get(0) == 0){
                col = true;
            }
        }

        for(int j = 0; j < m; j++){
            if(matrix.get(0).get(j) == 0){
                row = true;
            }
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix.get(i).get(j) == 0){
                    matrix.get(0).set(j, 0);
                    matrix.get(i).set(0, 0);
                }
            }
        }

        for(int i = 1; i < n; i++){
            if(matrix.get(i).get(0) == 0){
                for(int j = 0; j < m; j++){
                    matrix.get(i).set(j, 0);
                }
            }

        }

        for(int j = 1; j < m; j++){
            if(matrix.get(0).get(j) == 0){
                for(int i = 0; i < n; i++){
                    matrix.get(i).set(j, 0);
                }
            }

        }


        if(row){
            for(int j = 0; j < m; j++){
                matrix.get(0).set(j, 0);
            }
        }
        if(col){
            for(int i = 0; i < m; i++){
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1, 0)));

        int n = matrix.size(); //row
        int m = matrix.get(0).size(); // column

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("Final Matrix is : ");

        for(ArrayList<Integer> row : matrix){
            for(Integer ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }


    }
}
