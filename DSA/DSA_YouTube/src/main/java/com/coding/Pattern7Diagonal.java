<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern7Diagonal.java
package com.coding;

import java.util.Scanner;

public class Pattern7Diagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i == j){ //main condition
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}
=======
package com.coding;

import java.util.Scanner;

public class Pattern7Diagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i == j){ //main condition
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern7Diagonal.java
