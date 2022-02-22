package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String expression;
        int firstNumber;
        int secondNumber;

        char action;
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        while (!userChoice.equals("no")) {
            System.out.println("Введите математическое выражение: ");
            expression = scanner.nextLine();
            String[] expressionArray = expression.split(" ");
            firstNumber = Integer.parseInt(expressionArray[0]);
            secondNumber = Integer.parseInt(expressionArray[2]);

            action = expressionArray[1].charAt(0);

            System.out.println("Результат: " + Calculator.calc(firstNumber, secondNumber, action));

            System.out.println("Хотите продолжить вычисления? [yes/no]:");

            while (!userChoice.equals("yes")) {
                userChoice = scanner.nextLine();
                if (!userChoice.equals("no") && !userChoice.equals("yes")) {
                    System.out.println("неверный ввод, повторите [yes/no]:");
                } else
                    break;
            }
        }
    }
}