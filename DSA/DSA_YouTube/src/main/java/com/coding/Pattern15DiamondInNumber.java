<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/Pattern15DiamondInNumber.java
package com.coding;

import java.util.Scanner;

public class Pattern15DiamondInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n / 2;
        int star = 1;
        int value = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            int rowValue = value;
            for (int j = 1; j <= star; j++) {

                System.out.print(rowValue + "\t");
                if (j <= star / 2) {
                    rowValue++;
                } else {
                    rowValue--;
                }
            }

            System.out.println();
            if (i <= n / 2) {
                space--;
                star += 2;
                value++;
            } else {
                space++;
                star -= 2;
                value--;
            }

        }
    }
}
=======
package com.coding;

import java.util.Scanner;

public class Pattern15DiamondInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n / 2;
        int star = 1;
        int value = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            int rowValue = value;
            for (int j = 1; j <= star; j++) {

                System.out.print(rowValue + "\t");
                if (j <= star / 2) {
                    rowValue++;
                } else {
                    rowValue--;
                }
            }

            System.out.println();
            if (i <= n / 2) {
                space--;
                star += 2;
                value++;
            } else {
                space++;
                star -= 2;
                value--;
            }

        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/Pattern15DiamondInNumber.java
