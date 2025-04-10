<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/NumberSystemAnyBaseToAnyBase.java
package com.coding;

import java.util.Scanner;

public class NumberSystemAnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int convertedNum = anyBaseToDecimal(n1, b1); // 172, 8
        int output = decimalToAnyBase(convertedNum, b2);
        System.out.println(output);
    }
    public static int anyBaseToDecimal (int num, int base) {

        int power = 1;
        int convertedNum = 0;

        while (num != 0) {
            int rem = num % 10;

            convertedNum += rem*power;

            power *= base;
            num /= 10;

        }
        System.out.println("anyBaseToDecimal : " + convertedNum);
        return convertedNum;
    }

    public static int decimalToAnyBase(int num, int base) {

        int power = 1;
        int convertedNum = 0;

        while (num != 0) {
            int rem = num % base;

            convertedNum += rem*power;
            power *= 10;
            System.out.println("decimalToAnyBaseLoop : " + num + " "+ convertedNum);
            num /= base;
        }
        System.out.println("decimalToAnyBase : " + convertedNum);
        return convertedNum;
    }
}
=======
package com.coding;

import java.util.Scanner;

public class NumberSystemAnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int convertedNum = anyBaseToDecimal(n1, b1); // 172, 8
        int output = decimalToAnyBase(convertedNum, b2);
        System.out.println(output);
    }
    public static int anyBaseToDecimal (int num, int base) {

        int power = 1;
        int convertedNum = 0;

        while (num != 0) {
            int rem = num % 10;

            convertedNum += rem*power;

            power *= base;
            num /= 10;

        }
        System.out.println("anyBaseToDecimal : " + convertedNum);
        return convertedNum;
    }

    public static int decimalToAnyBase(int num, int base) {

        int power = 1;
        int convertedNum = 0;

        while (num != 0) {
            int rem = num % base;

            convertedNum += rem*power;
            power *= 10;
            System.out.println("decimalToAnyBaseLoop : " + num + " "+ convertedNum);
            num /= base;
        }
        System.out.println("decimalToAnyBase : " + convertedNum);
        return convertedNum;
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/NumberSystemAnyBaseToAnyBase.java
