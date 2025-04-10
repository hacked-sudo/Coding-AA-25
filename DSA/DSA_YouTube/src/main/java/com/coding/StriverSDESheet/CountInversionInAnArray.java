package com.coding.StriverSDESheet;

import java.util.ArrayList;

public class CountInversionInAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};

//        BruteForceApproach(arr);
        OptimalApproach(arr);
    }

    private static void BruteForceApproach(int[] arr) {
        int Inversioncount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Inversioncount++;
                }
            }
        }
        System.out.println(Inversioncount);
    }

    private static void OptimalApproach(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        System.out.println(mergeSortwithInversionCount(arr, low, high));

    }

    private static int mergeSortwithInversionCount(int[] arr, int low, int high) {
        int recursionCount = 0;
        if(low >= high) return 0;
        int mid = (low + high) / 2;


        recursionCount += mergeSortwithInversionCount(arr, low, mid);
        recursionCount += mergeSortwithInversionCount(arr, mid + 1, high);
        recursionCount += mergeTheArray(arr, low, mid, high);
        return recursionCount;

    }

    private static int mergeTheArray(int[] arr, int low, int mid, int high) {
        int leftPointer = low;
        int rightPointer = mid+ 1;
        int count = 0;

        ArrayList<Integer> tempArr = new ArrayList<>();

        while(leftPointer <= mid && rightPointer <= high){
            if(arr[leftPointer] <= arr[rightPointer]){
                tempArr.add(arr[leftPointer]);
                leftPointer++;
            }else{
                count += (mid - leftPointer + 1);
                tempArr.add(arr[rightPointer]);
                rightPointer++;
            }
        }

        while(leftPointer <= mid){
            tempArr.add(arr[leftPointer]);
            leftPointer++;
        }
        while(rightPointer <= high){
            tempArr.add(arr[rightPointer]);
            rightPointer++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = tempArr.get(i-low);
        }
        return count;
    }
}
