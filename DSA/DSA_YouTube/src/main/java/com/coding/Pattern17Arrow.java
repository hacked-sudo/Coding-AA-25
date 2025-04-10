<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern17Arrow.java
package com.coding;

import java.util.Scanner;

public class Pattern17Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n / 2;
        int star = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                star++;
            } else {
                star--;
            }
            System.out.println();

        }


    }
}
=======
package com.coding;

import java.util.Scanner;

public class Pattern17Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n / 2;
        int star = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                star++;
            } else {
                star--;
            }
            System.out.println();

        }


    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern17Arrow.java
