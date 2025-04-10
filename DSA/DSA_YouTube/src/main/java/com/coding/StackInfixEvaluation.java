package com.coding;

import java.util.Scanner;
import java.util.Stack;

public class StackInfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        /* rules
        operator and operand goes to respective stack but while going if
         ( - just push it to operator stack
         ) - this would pop operator stack 1 time and operand 2 time untill ( opening bracket found and then 1 extra to pop opening bracket
        for operator - if in stack peek higher precedence operator found then pop and pop 2 from operand stack and process and then push it to stack of operand
        if same precedence found then also pop,
        poping logic is bacicaaly to process the element of higher precedence first and if same precedence then left to right
         */

        Stack<Integer> operand = new Stack<>();
        Stack<Character>  operator = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);

            if(ch == '('){
                operator.push(ch);
            } else if(Character.isDigit(ch)){
                operand.push(ch - '0'); // char to int
            } else if (ch == ')'){
                while(operator.peek() != '('){
                    char optor = operator.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    int value = calculate(v1, v2, optor);
                    operand.push(value);
                }
                operator.pop();
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // ch is wanting to process higher priority to process first
                while (!operator.isEmpty() && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())){
                    char optor = operator.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    int value = calculate(v1, v2, optor);
                    operand.push(value);
                }
                // ch is push itself
                operator.push(ch);
            }
        }

        while(!operator.isEmpty()){
            char optor = operator.pop();
            int v2 = operand.pop();
            int v1 = operand.pop();
            int value = calculate(v1, v2, optor);
            operand.push(value);
        }

        System.out.println(operand.peek());

    }

    public static int precedence(char operator){
        if(operator == '*' || operator == '/')
            return 2;
        else if(operator == '+')
            return 1;
        else
            return 1; // -case would come here
    }

    public static int calculate(int value1, int value2, char operator){
        if(operator == '*')
            return value1 * value2;
        else if(operator == '/')
            return value1 / value2;
        else if(operator == '+')
            return value1 + value2;
        else
            return value1 - value2;
    }




}
