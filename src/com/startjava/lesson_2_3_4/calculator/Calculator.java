package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static String calc(String expression) {
        int firstNumber;
        int secondNumber;
        char action;
        String[] expressionArray = expression.split(" ");
        firstNumber = Integer.parseInt(expressionArray[0]);
        secondNumber = Integer.parseInt(expressionArray[2]);
        action = expressionArray[1].charAt(0);

        switch (action) {
            case '*':
                return Integer.toString(Math.multiplyExact(firstNumber, secondNumber));
            case '/':
                return Integer.toString(firstNumber / secondNumber);
            case '+':
                return Integer.toString((Math.addExact(firstNumber, secondNumber)));
            case '-':
                return Integer.toString((Math.subtractExact(firstNumber, secondNumber)));
            case '%':
                return Integer.toString(firstNumber % secondNumber);
            case '^':
                return Integer.toString((int)Math.pow(firstNumber, secondNumber));
            default:
                System.out.println("неверно введено действие");
                return "0";
        }
    }
}