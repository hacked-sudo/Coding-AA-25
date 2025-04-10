<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern16HalfHollowTraingle.java
package com.coding;

import java.util.Scanner;

public class Pattern16HalfHollowTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = 2 * n - 3;
        int col = 2 * n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            int value = 1;
            for (int j = 1; j <= star; j++) {
                System.out.print(value + "\t");
                value++;
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            if (i == n){
                star--;
                value--;
            }
            for (int j = 1; j <= star; j++) {
                value--;
                 System.out.print(value + "\t");
            }
            star++;
            space -= 2;

            System.out.println();
        }
    }
}
=======
package com.coding;

import java.util.Scanner;

public class Pattern16HalfHollowTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = 2 * n - 3;
        int col = 2 * n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            int value = 1;
            for (int j = 1; j <= star; j++) {
                System.out.print(value + "\t");
                value++;
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            if (i == n){
                star--;
                value--;
            }
            for (int j = 1; j <= star; j++) {
                value--;
                 System.out.print(value + "\t");
            }
            star++;
            space -= 2;

            System.out.println();
        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern16HalfHollowTraingle.java
