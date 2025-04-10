package com.coding.StriverSDESheet;

public class KadaneAlgorithm {
    public static int maxSubArraySum(int[] arr){
        int n = arr.length;
        int sum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sumi = 0;

                for(int k = i; k <= j; k++){
                    sumi += arr[k];
                }
                sum = Math.max(sumi, sum);
            }
        }
        return sum;
    }

    public static int maxSubArraySumBetter(int[] arr){
        int n = arr.length;
        int sum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int sumi = 0;
            for(int j = i; j < n; j++){
                    sumi += arr[j];
                    sum = Math.max(sumi, sum);
            }

        }
        return sum;
    }

    public static int maxSubArraySumBest(int[] arr){
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
              sum += arr[i];

            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }

        }
        return maxSum;
    }
    public static void main(String[] args) {

       int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

       //int ans = maxSubArraySum(arr);
//       int ans = maxSubArraySumBetter(arr);
       int ans = maxSubArraySumBest(arr);
       System.out.println(ans);
    }
}
