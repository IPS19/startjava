package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        char action;
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        while (!userChoice.equals("no")) {
            System.out.println("Введите первое число");
            firstNumber = scanner.nextInt();

            System.out.println("введите действие");
            action = scanner.next().charAt(0);

            System.out.println("Введите второе число");
            secondNumber = scanner.nextInt();

            System.out.println("Результат: " + Calculator.calc(firstNumber, secondNumber, action));

            System.out.println("Хотите продолжить вычисления? [yes/no]:");

            while (!userChoice.equals("yes")) {
                userChoice = scanner.next();
                if (!userChoice.equals("no")) {
                    System.out.println("неверный ввод, повторите [yes/no]:");
                } else
                    break;
            }
        }
    }
}