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
            if(player2.getCountAttempts() == 10 && player1.getCountAttempts() == 10)
                break;
        }
        showPlayerAttempts(player1);
        showPlayerAttempts(player2);
        player1.setCountAttempts(0);
        player2.setCountAttempts(0);
        player1.resetNumbers();
        player2.resetNumbers();
    }

    private boolean compareNumbers(Player player, int generatedNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(player.getName() + ", введи число");
        player.addNumber(scanner.nextInt());

        player.setCountAttempts(player.getCountAttempts() + 1);

        if (player.getNumber() < generatedNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (player.getNumber() > generatedNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getNumber() == generatedNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число c " + (player.getCountAttempts()) + " попытки");
            return true;
        }

        if (player.getCountAttempts() == 10) {
            System.out.println("у игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void showPlayerAttempts(Player player) {
        int[] playerNumbers = player.getNumbers();
        System.out.println("введённые  игроком " + player.getName() + " числа: ");
        for (int number : playerNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}