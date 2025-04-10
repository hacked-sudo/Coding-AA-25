package com.coding;

import java.util.ArrayList;

public class BitManipulationGreyCode {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> resultRecursion = solution(n);
        System.out.println(resultRecursion);
    }

    public static ArrayList<String> solution(int n){
        if(n == 1){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("0");
            baseResult.add("1");
            return baseResult;
        }
        ArrayList<String> baseResultReturn = solution(n-1);
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < baseResultReturn.size(); i++){
            String str = baseResultReturn.get(i);
            result.add("0" + str);
        }

        for(int i = baseResultReturn.size() - 1; i >= 0; i--){
            String str = baseResultReturn.get(i);
            result.add("1" + str);
        }
        return result;
    }
}
