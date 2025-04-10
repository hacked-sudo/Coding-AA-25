package com.coding.StriverSDESheet;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle_nCr {
    public static long nCr(int n, int r){
        long result = 1;
        for(int i = 0; i < r; i++){
            result *= n - i;
            result = result / (i + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("nCr " + nCr(7,5));
        // pascal triangle is started from 0 index
        // means first row is 0C0 then 1C0 1C1 ...
        printPascalRow(5);
        System.out.println("\n--------------------");
        List<List<Integer>> completeTraingle = printfirstNpascalRow(5);
        for(List<Integer> row : completeTraingle){
            for(Integer element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printPascalRow(int n){
        int ans = 1;
        System.out.print(ans + " ");
       // row- col by col
        for(int i = 1; i <n; i++){
            ans = ans * (n-i);
            ans = ans / i;

            System.out.print(ans + " ");
        }
    }

    public static List<Integer> generateRow(int row) {
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;

    }

    public static List<List<Integer>> printfirstNpascalRow(int n){
            List<List<Integer>> ans = new ArrayList<>();

            for(int rowNum = 1; rowNum <= n; rowNum++){
                ans.add(generateRow(rowNum));
        }
            return ans;
    }
}
