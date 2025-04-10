<<<<<<< HEAD:DSA/DSA_YouTube/src/main/java/com/coding/StackFindBalancedOrNot.java
package com.coding;

import java.util.Scanner;
import java.util.Stack;

public class StackFindBalancedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            System.out.println(st);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean value = handleClosingBracket(st, '(');
                if (value == false) {
                    return;
                }

            } else if (ch == '}') {
                boolean value = handleClosingBracket(st, '{');
                if (value == false) {
                    return;
                }

            } else if (ch == ']') {
                boolean value = handleClosingBracket(st, '[');
                if (value == false) {
                    return;
                }

            }
        }
        if (!st.isEmpty()) {
            System.out.println("Less Closing Bracket");
        } else {
            System.out.println("Balanced !");
        }
    }

    private static boolean handleClosingBracket(Stack<Character> st, Character ch) {
        if (st.isEmpty()) {
            System.out.println("Less Opening Bracket");
            return false;
        } else if (st.peek() != ch) {
            System.out.println("Bracket Mismatch");
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
=======
package com.coding;

import java.util.Scanner;
import java.util.Stack;

public class StackFindBalancedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            System.out.println(st);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean value = handleClosingBracket(st, '(');
                if (value == false) {
                    return;
                }

            } else if (ch == '}') {
                boolean value = handleClosingBracket(st, '{');
                if (value == false) {
                    return;
                }

            } else if (ch == ']') {
                boolean value = handleClosingBracket(st, '[');
                if (value == false) {
                    return;
                }

            }
        }
        if (!st.isEmpty()) {
            System.out.println("Less Closing Bracket");
        } else {
            System.out.println("Balanced !");
        }
    }

    private static boolean handleClosingBracket(Stack<Character> st, Character ch) {
        if (st.isEmpty()) {
            System.out.println("Less Opening Bracket");
            return false;
        } else if (st.peek() != ch) {
            System.out.println("Bracket Mismatch");
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
>>>>>>> 371b788fa2fc4cc43cdee2560f35100677b539a2:DSA/DSA_YouTube/src/main/java/Coding/DSA_YouTube/StackFindBalancedOrNot.java
