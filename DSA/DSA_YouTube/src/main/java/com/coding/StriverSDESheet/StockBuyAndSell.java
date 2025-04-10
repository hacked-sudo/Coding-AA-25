package com.coding.StriverSDESheet;

public class StockBuyAndSell {

    public static int maxProfit(int[] arr){
        int max_profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0;i < arr.length; i++){
            if(arr[i]  < minPrice){
                minPrice = arr[i];
            }
            int profit = arr[i] - minPrice;
            max_profit = Math.max(profit, max_profit);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }
}
