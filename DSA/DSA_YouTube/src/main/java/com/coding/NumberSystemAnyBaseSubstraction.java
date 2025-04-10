<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/NumberSystemAnyBaseSubstraction.java
package com.coding;

import java.util.Scanner;

public class NumberSystemAnyBaseSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int n1 = sc.nextInt(); // always bigger number
        int n2 = sc.nextInt(); // always smaller number
        int carry = 0;
        int power = 1;
        int output = 0;
        while (n1 != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 /= 10;
            n2 /= 10;
            int outputDigit = 0;
            d1 = d1 + carry;
            if (d1 >= d2) {
                carry = 0;
                outputDigit = d1 - d2;
            } else {
                carry = -1;
                d1 = d1 + base;
                outputDigit = d1 - d2;
            }

            output += outputDigit*power;
            power *= 10;
            System.out.println("output " + output);

        }
        System.out.println("Output " + output);
    }
}
=======
package com.coding;

import java.util.Scanner;

public class NumberSystemAnyBaseSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int n1 = sc.nextInt(); // always bigger number
        int n2 = sc.nextInt(); // always smaller number
        int carry = 0;
        int power = 1;
        int output = 0;
        while (n1 != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 /= 10;
            n2 /= 10;
            int outputDigit = 0;
            d1 = d1 + carry;
            if (d1 >= d2) {
                carry = 0;
                outputDigit = d1 - d2;
            } else {
                carry = -1;
                d1 = d1 + base;
                outputDigit = d1 - d2;
            }

            output += outputDigit*power;
            power *= 10;
            System.out.println("output " + output);

        }
        System.out.println("Output " + output);
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/NumberSystemAnyBaseSubstraction.java
