package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public static int calc(int firstNumber, int secondNumber, char action) {
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
                return (int)Math.pow(firstNumber, secondNumber);
            default:
                System.out.println("неверно введено действие");
                return 0;
        }
    }
}