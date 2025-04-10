<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern2.java
package com.coding;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) { // thing to learn here is Eg. in second loop j = 5 and i = 2 so j would run for value J = 5, 4, 3
                System.out.print("*\t");
            }
            System.out.println();

        }
    }
}
=======
package com.coding;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) { // thing to learn here is Eg. in second loop j = 5 and i = 2 so j would run for value J = 5, 4, 3
                System.out.print("*\t");
            }
            System.out.println();

        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern2.java
