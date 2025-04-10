<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/CountDigitFunction.java
package com.coding;

import java.util.Scanner;

public class CountDigitFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
       System.out.println(fetchDigitCount(num, k)) ;
    }

    private static int fetchDigitCount(int num, int k) {
        int count = 0;

        while(num != 0){
            int rem = num % 10;
            num = num / 10;
            if(rem == k){
                count++;
            }
        }
        return count;
    }
}
=======
package com.coding;

import java.util.Scanner;

public class CountDigitFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
       System.out.println(fetchDigitCount(num, k)) ;
    }

    private static int fetchDigitCount(int num, int k) {
        int count = 0;

        while(num != 0){
            int rem = num % 10;
            num = num / 10;
            if(rem == k){
                count++;
            }
        }
        return count;
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/CountDigitFunction.java
