<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern3.java
package com.coding;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int starCount = 1;
        int spaceCount = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= starCount; k++) {
                System.out.print("*\t");
            }
            starCount++;
            spaceCount--;
            System.out.println();
        }
    }
}

=======
package com.coding;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int starCount = 1;
        int spaceCount = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= starCount; k++) {
                System.out.print("*\t");
            }
            starCount++;
            spaceCount--;
            System.out.println();
        }
    }
}

>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern3.java
