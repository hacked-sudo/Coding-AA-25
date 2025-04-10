<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/NumberSystemAnyBaseAddition.java
package com.coding;

import java.util.Scanner;

public class NumberSystemAnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int carry = 0;
        int output = 0;
        int power = 1;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int sum = d1 + d2 + carry;
            carry = sum / base;
            int outputDigit = sum % base;

            output += outputDigit*power;
            System.out.println("outputDigit = " +  outputDigit + " carry = " + carry);

            n1 /= 10;
            n2 /= 10;
            power *= 10;

        }
        System.out.println("output = " + output);
    }
}
=======
package com.coding;

import java.util.Scanner;

public class NumberSystemAnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int carry = 0;
        int output = 0;
        int power = 1;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int sum = d1 + d2 + carry;
            carry = sum / base;
            int outputDigit = sum % base;

            output += outputDigit*power;
            System.out.println("outputDigit = " +  outputDigit + " carry = " + carry);

            n1 /= 10;
            n2 /= 10;
            power *= 10;

        }
        System.out.println("output = " + output);
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/NumberSystemAnyBaseAddition.java
