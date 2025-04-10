<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern6HollowDiamond.java
package com.coding;

import java.util.Scanner;

public class Pattern6HollowDiamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 1;
        int star = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            for(int j = 0; j < space; j++){
                System.out.print("\t");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (i <= n / 2) {
                space += 2;
                star -= 1;
            } else {
                space -= 2;
                star += 1;
            }

        }
    }
}
=======
package com.coding;

import java.util.Scanner;

public class Pattern6HollowDiamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 1;
        int star = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            for(int j = 0; j < space; j++){
                System.out.print("\t");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (i <= n / 2) {
                space += 2;
                star -= 1;
            } else {
                space -= 2;
                star += 1;
            }

        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern6HollowDiamond.java
