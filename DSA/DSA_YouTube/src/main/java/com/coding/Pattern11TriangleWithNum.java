<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern11TriangleWithNum.java
package com.coding;

import java.util.Scanner;

public class Pattern11TriangleWithNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + "\t");
                counter++;
            }
            System.out.println();
        }
    }
}
=======
package com.coding;

import java.util.Scanner;

public class Pattern11TriangleWithNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + "\t");
                counter++;
            }
            System.out.println();
        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern11TriangleWithNum.java
