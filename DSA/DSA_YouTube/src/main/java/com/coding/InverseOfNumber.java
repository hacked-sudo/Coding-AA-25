<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/InverseOfNumber.java
package com.coding;
import java.util.*;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int UserNum = scn.nextInt(); //15234 -> 41253
        int inverseNum = 0;
        int count = 0;
        int num = UserNum;
        int digit_count =0;
        while(num != 0){
            int rem = num % 10;
            num = num / 10;

                digit_count++;

        }
        while(UserNum != 0){
            count++;
            int digit = UserNum % 10;
            System.out.println("digit " + digit);
            int multiplier = (int)Math.pow(10,digit_count-1);
            int n = count * multiplier;
            inverseNum += n;
            UserNum = UserNum / 10;
            System.out.println(inverseNum);
        }

        System.out.println(inverseNum);



    }



}
=======
package com.coding;
import java.util.*;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int UserNum = scn.nextInt(); //15234 -> 41235
        int inverseNum = 0;
        int count = 0;
        int num = UserNum;
        int digit_count =0;
        while(num != 0){
            int rem = num % 10;
            num = num / 10;

                digit_count++;

        }
        while(UserNum != 0){
            count++;
            int digit = UserNum % 10;
            System.out.println("digit " + digit);
            int multiplier = (int)Math.pow(10,digit_count-1);
            int n = count * multiplier;
            inverseNum += n;
            UserNum = UserNum / 10;
            System.out.println(inverseNum);
        }

        System.out.println(inverseNum);



    }



}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/InverseOfNumber.java
