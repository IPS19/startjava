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

        while (!Player.isGuess) {
            compare(player2, generatedNumber);
            compare(player1, generatedNumber);
            if (player1.getNumberIndex() == 9 && player2.getNumberIndex() == 9)
                break;
        }
    }

    public void compare(Player player, int generatedNumber) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;

        System.out.println(player.getName() + ", введи число");

        player.setNumber(index, scanner.nextInt());
        index++;
        if (player.getNumber(index) < generatedNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (player.getNumber(index) > generatedNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getNumber(index) == generatedNumber) {
            Player.isGuess = true;
            System.out.println("Игрок" + player.getName() + " угадал число c " + (player.getNumberIndex() + 1) + "попытки");
        }
        if (player.getNumberIndex() == 9)
            System.out.println("у игрока" + player.getName() + "закончились попытки");
    }
}