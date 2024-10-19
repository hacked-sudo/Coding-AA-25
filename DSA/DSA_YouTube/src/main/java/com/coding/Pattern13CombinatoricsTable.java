package com.coding;

import java.util.Scanner;

public class Pattern13CombinatoricsTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int iCj_value = 1;
            for(int j = 0; j <=i; j++){
                System.out.print(iCj_value+"\t");
                int iCj_plus1_value = (iCj_value * (i-j))/(j+1);
                iCj_value = iCj_plus1_value;
            }
            System.out.println();
        }

    }

}
