<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern12TraingleFibonacciNum.java
package com.coding;

import java.util.Scanner;

public class Pattern12TraingleFibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int third = first + second;
                System.out.print(first + "\t");

                first = second;
                second = third;

            }
            System.out.println();
        }
    }
}
=======
package com.coding;

import java.util.Scanner;

public class Pattern12TraingleFibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int third = first + second;
                System.out.print(first + "\t");

                first = second;
                second = third;

            }
            System.out.println();
        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern12TraingleFibonacciNum.java
