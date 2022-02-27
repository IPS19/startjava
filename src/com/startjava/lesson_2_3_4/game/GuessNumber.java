package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
        Random random = new Random();
        int generatedNumber = random.nextInt(100) + 1;

        while (!compareNumbers(player1, generatedNumber) && !compareNumbers(player2, generatedNumber)) {
            compareNumbers(player1, generatedNumber);
            compareNumbers(player2, generatedNumber);
        }
        showPlayerAttempts(player1);
        showPlayerAttempts(player2);
        player1.setPlayerAttemptQuantity(0);
        player2.setPlayerAttemptQuantity(0);
        player1.resetNumbers();
        player2.resetNumbers();
    }

    public boolean compareNumbers(Player player, int generatedNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(player.getName() + ", введи число");

        player.addNumber(player.getPlayerAttemptQuantity(), scanner.nextInt());

        if (player.getNumber(player.getPlayerAttemptQuantity()) < generatedNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (player.getNumber(player.getPlayerAttemptQuantity()) > generatedNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getNumber(player.getPlayerAttemptQuantity()) == generatedNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число c " + (player.getPlayerAttemptQuantity() + 1) + " попытки");
            return true;
        }
        player.setPlayerAttemptQuantity(player.getPlayerAttemptQuantity()+1);

        if (player.getPlayerAttemptQuantity() == 9) {
            System.out.println("у игрока " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    public void showPlayerAttempts(Player player) {
        int[] playerAttempts = player.getNumbers();
        System.out.println("введённые  игроком " + player.getName() + " числа: ");
        for (int number : playerAttempts) {
            System.out.print(number + " ");
        }
            System.out.println();
    }
}