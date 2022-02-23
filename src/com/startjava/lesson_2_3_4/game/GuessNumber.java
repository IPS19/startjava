package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int generatedNumber = random.nextInt(100) + 1;

        while (true) {
            System.out.println(player1.getName() + ", введи число");
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() < generatedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player1.getNumber() > generatedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player1.getNumber() == generatedNumber) {
                System.out.println(player1.getName() + " угадал!");
                break;
            }
            System.out.println(player2.getName() + ", введи число");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() < generatedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player2.getNumber() > generatedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player2.getNumber() == generatedNumber) {
                System.out.println(player2.getName() + " угадал!");
                break;
            }
        }
    }
}