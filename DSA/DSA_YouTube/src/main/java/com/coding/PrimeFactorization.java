<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/PrimeFactorization.java
package com.coding;

import java.util.Scanner;
//multiplication of prime number that forms a number
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //1440 or 46 (special case)

        for (int div = 2; div * div <= num; div++) { //Optimization to run divisor under √num
            //System.out.println("i" + div + " ");
            while(num % div == 0){
                System.out.println(div);
                num = num / div;
            }
        }
        if(num != 1){
            System.out.println(num);
        }
    }
=======
package com.coding;

import java.util.Scanner;
//multiplication of prime number that forms a number
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //1440 or 46 (special case)

        for (int div = 2; div * div <= num; div++) { //Optimization to run divisor under √num
            //System.out.println("i" + div + " ");
            while(num % div == 0){
                System.out.println(div);
                num = num / div;
            }
        }
        if(num != 1){
            System.out.println(num);
        }
    }
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/PrimeFactorization.java
}