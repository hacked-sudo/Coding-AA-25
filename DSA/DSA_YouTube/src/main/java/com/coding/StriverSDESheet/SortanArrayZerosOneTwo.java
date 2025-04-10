package com.coding.StriverSDESheet;

import java.util.ArrayList;
import java.util.Arrays;

public class SortanArrayZerosOneTwo {

    public static void merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

// nlogn time complexity
    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }
    //time complexity is 2N
    public static void sortByCounting(int[] arr) {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count_0++;
            }else if(arr[i] == 1){
                count_1++;
            }else {
                count_2++;
            }
        }


        int index = 0;
        for (int i = 0; i < count_0; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < count_1; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < count_2; i++) {
            arr[index++] = 2;
        }


    }

    public static void swap(int[] nums, int i, int index){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
// N, Best complexity for the problem
    public static void dutchNationalFlagAlgorithm(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            }else {
                swap(arr, high, mid);
                high--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 1, 0 , 2, 2, 0};
        int n = arr.length - 1;
//        mergeSort(arr, 0, n);
        dutchNationalFlagAlgorithm(arr);
//        sortByCounting(arr);

        System.out.println(Arrays.toString(arr));
    }
}
