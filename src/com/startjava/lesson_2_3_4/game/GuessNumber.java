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
        Random random = new Random();
        int generatedNumber = random.nextInt(100) + 1;

        while (!compareNumbers(player1, generatedNumber) && !compareNumbers(player2, generatedNumber)) {
            if(player2.countAttempts == 10 && player1.countAttempts == 10)
                break;
        }
        showPlayerAttempts(player1);
        showPlayerAttempts(player2);
        player1.countAttempts = 0;
        player2.countAttempts = 0;
        player1.resetNumbers();
        player2.resetNumbers();
    }

    private boolean compareNumbers(Player player, int generatedNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(player.getName() + ", введи число");
        player.addNumber(player.countAttempts, scanner.nextInt());

        player.setCountAttempts(player.countAttempts + 1);

        if (player.getNumber(player.countAttempts - 1) < generatedNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else if (player.getNumber(player.countAttempts - 1) > generatedNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else if (player.getNumber(player.countAttempts - 1) == generatedNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число c " + (player.countAttempts) + " попытки");
            return true;
        }

        if (player.countAttempts == 10) {
            System.out.println("у игрока " + player.getName() + " закончились попытки");
            return false;
        }
        return false;
    }

    private void showPlayerAttempts(Player player) {
        int[] playerAttempts = player.getNumbers();
        System.out.println("введённые  игроком " + player.getName() + " числа: ");
        for (int number : playerAttempts) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}