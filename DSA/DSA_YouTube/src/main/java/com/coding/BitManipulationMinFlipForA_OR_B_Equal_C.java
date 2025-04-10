package com.coding;

public class BitManipulationMinFlipForA_OR_B_Equal_C {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 5;

        int ans = 0;

        for(int i = 0; i < 32; i++){
            boolean ai = false;
            boolean bi = false;
            boolean ci = false;
            if((a & (1 << i)) > 0){
                ai = true;
            }
            if((b & (1 << i)) > 0){
                bi = true;
            }
            if((c & (1 << i)) > 0){
                ci = true;
            }

            if(ci){
                if(!ai && !bi) ans++;
            }else{
                if(ai && bi) ans += 2;
                else if(ai || bi) ans++;
            }

        }

        System.out.println(ans);
    }
}
