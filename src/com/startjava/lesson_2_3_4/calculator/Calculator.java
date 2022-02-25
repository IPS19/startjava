package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calc(String expression) {

        String[] expressionArray = expression.split(" ");
        int firstNumber = Integer.parseInt(expressionArray[0]);
        int secondNumber = Integer.parseInt(expressionArray[2]);
        char action = expressionArray[1].charAt(0);

        switch (action) {
            case '*':
                return Math.multiplyExact(firstNumber, secondNumber);
            case '/':
                return firstNumber / secondNumber;
            case '+':
                return Math.addExact(firstNumber, secondNumber);
            case '-':
                return Math.subtractExact(firstNumber, secondNumber);
            case '%':
                return firstNumber % secondNumber;
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            default:
                System.out.println("неверно введено действие");
                return 0;
        }
    }
}