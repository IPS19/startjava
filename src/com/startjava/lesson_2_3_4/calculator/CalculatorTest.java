package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String expression;

        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        while (!userChoice.equals("no")) {
            System.out.println("Введите математическое выражение: ");
            expression = scanner.nextLine();

            System.out.println("Результат: " + Calculator.calc(expression));

            System.out.println("Хотите продолжить вычисления? [yes/no]:");

            while (!userChoice.equals("yes") && !userChoice.equals("no")) {
                userChoice = scanner.nextLine();
                if (!userChoice.equals("no") && !userChoice.equals("yes")) {
                    System.out.println("неверный ввод, повторите [yes/no]:");
                }
            }
        }
    }
}