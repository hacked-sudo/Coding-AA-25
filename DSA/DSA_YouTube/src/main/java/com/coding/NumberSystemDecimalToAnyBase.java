<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/NumberSystemDecimalToAnyBase.java
package com.coding;

import java.util.Scanner;

public class NumberSystemDecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();

        int power = 0;
        int convertedNum = 0;

        while(number != 0){
            int rem = number % base;
            int baseMuliplier = (int)Math.pow(10,power);

            convertedNum = convertedNum + (rem*baseMuliplier);

            power++;
            number = number / base;
        }
        System.out.println(convertedNum);
    }
}
=======
package com.coding;

import java.util.Scanner;

public class NumberSystemDecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();

        int power = 0;
        int convertedNum = 0;

        while(number != 0){
            int rem = number % base;
            int baseMuliplier = (int)Math.pow(10,power);

            convertedNum = convertedNum + (rem*baseMuliplier);

            power++;
            number = number / base;
        }
        System.out.println(convertedNum);
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/NumberSystemDecimalToAnyBase.java
