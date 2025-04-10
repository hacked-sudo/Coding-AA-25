package com.coding;

import java.util.Scanner;

public class NumberSystemAnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int anyBaseMultipliedOutput = getSingleProduct(n1, n2, base);
        System.out.println("anyBaseMultipliedOutput : " + anyBaseMultipliedOutput);
    }

    private static int getSingleProduct(int n1, int n2, int base) {
        int multiLayerOutputPower = 1;

        while (n2 != 0) {
            int d2 = n2 % 10;
            int carry = 0;
            int power = 1;
            int multLayerOutput = 0;


            while (n1 != 0 || carry > 0) {
                int d1 = n1 % 10;

                n1 /= 10;

                int muiltipliedDigit = (d1 * d2) + carry;
                int outputDigit = muiltipliedDigit % base;
                carry = muiltipliedDigit / base;
                multLayerOutput += outputDigit * power;

                power *= 10;

            }
            multLayerOutput *= multiLayerOutputPower;
            System.out.println("multLayerOutput : " + multLayerOutput);
            multiLayerOutputPower *= 10;

            n2 /= 10;


        }
        return multiLayerOutputPower;
    }

    public static int anyBaseAddition(int n1, int n2, int base) {
        int carry = 0;
        int output = 0;
        int power = 1;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int sum = d1 + d2 + carry;
            carry = sum / base;
            int outputDigit = sum % base;

            output += outputDigit * power;
            System.out.println("outputDigit = " + outputDigit + " carry = " + carry);

            n1 /= 10;
            n2 /= 10;
            power *= 10;

        }
        return output;
    }
}
