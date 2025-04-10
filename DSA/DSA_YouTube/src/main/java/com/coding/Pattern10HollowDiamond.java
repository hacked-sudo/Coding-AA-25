<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern10HollowDiamond.java
package com.coding;

import java.util.Scanner;

public class Pattern10HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int innerSpace = n / 2;
        int outerSpace = -1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= innerSpace; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= outerSpace; j++) {
                System.out.print("\t");
            }
            if (i != 1 && i != n) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                innerSpace--;
                outerSpace += 2;
            } else {
                innerSpace++;
                outerSpace -= 2;
            }
            System.out.println();
        }
    }
}
=======
package com.coding;

import java.util.Scanner;

public class Pattern10HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int innerSpace = n / 2;
        int outerSpace = -1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= innerSpace; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= outerSpace; j++) {
                System.out.print("\t");
            }
            if (i != 1 && i != n) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                innerSpace--;
                outerSpace += 2;
            } else {
                innerSpace++;
                outerSpace -= 2;
            }
            System.out.println();
        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern10HollowDiamond.java
