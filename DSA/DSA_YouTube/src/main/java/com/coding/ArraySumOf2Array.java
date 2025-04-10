<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/ArraySumOf2Array.java
package com.coding;

import java.util.Scanner;

public class ArraySumOf2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] firstArr = new int[n1];
        for(int i = 0; i < firstArr.length; i++){
           firstArr[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] secondArr = new int[n2];
        for(int i = 0; i < secondArr.length; i++){
            secondArr[i] = sc.nextInt();
        }

        int[] outputArr = new int[Math.max(n1, n2)];
        int i = firstArr.length - 1;
        int j = secondArr.length - 1;
        int k = outputArr.length - 1;
        int carry = 0;

        while(k >= 0){
            int digit = carry;

            if(i >= 0){
                digit += firstArr[i];
            }
            if( j >= 0){
                digit += secondArr[j];
            }
            carry = digit / 10;
            digit = digit % 10;
            outputArr[k] = digit;
            System.out.println("digit " + digit);
            i--;
            j--;
            k--;
        }
        if(carry != 0){
            System.out.println(carry);
        }
        for (int itr = 0; itr < outputArr.length; itr++) {
            System.out.println(outputArr[itr]);
        }
    }
}
=======
package com.coding;

import java.util.Scanner;

public class ArraySumOf2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] firstArr = new int[n1];
        for(int i = 0; i < firstArr.length; i++){
           firstArr[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] secondArr = new int[n2];
        for(int i = 0; i < secondArr.length; i++){
            secondArr[i] = sc.nextInt();
        }

        int[] outputArr = new int[n1 > n2 ? n1 : n2];
        int i = firstArr.length - 1;
        int j = secondArr.length - 1;
        int k = outputArr.length - 1;
        int carry = 0;

        while(k >= 0){
            int digit = carry;

            if(i >= 0){
                digit += firstArr[i];
            }
            if( j >= 0){
                digit += secondArr[j];
            }
            carry = digit / 10;
            digit = digit % 10;
            outputArr[k] = digit;
            System.out.println("digit " + digit);
            i--;
            j--;
            k--;
        }
        if(carry != 0){
            System.out.println(carry);
        }
        for (int itr = 0; itr < outputArr.length; itr++) {
            System.out.println(outputArr[itr]);
        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/ArraySumOf2Array.java
