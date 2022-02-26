package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    int [] playerAttempt;


    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int generatedNumber = random.nextInt(100) + 1;

        while (!Player.isGuess) {
            compare(player2, generatedNumber);
            if(!Player.isGuess) {
                compare(player1, generatedNumber);
            }

            if (player1.getArrayIndex() == 9 && player2.getArrayIndex() == 9)
                break;
        }
        playerAttempt(player1);
        playerAttempt(player2);
    }

    public void compare(Player player, int generatedNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(player.getName() + ", введи число");

        player.addNumber(player.getArrayIndex(), scanner.nextInt());

        if (player.getNumbers(player.getArrayIndex()) < generatedNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (player.getNumbers(player.getArrayIndex()) > generatedNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getNumbers(player.getArrayIndex()) == generatedNumber) {
            Player.isGuess = true;
            System.out.println("Игрок " + player.getName() + " угадал число c " + (player.getArrayIndex() + 1) + " попытки");
        }
        player.setArrayIndex(player.getArrayIndex()+1);
        if (player.getArrayIndex() == 9) {
            System.out.println("у игрока " + player.getName() + " закончились попытки");
        }
    }
    public void playerAttempt(Player player) { //массив с введеными числами
        int count = 0;
        for (int i=0; i<10;i++){
            if (player.getNumbers(i) !=0) {
                count++;
            }
        }
        playerAttempt = Arrays.copyOfRange(player.getNumbers(), 0, count);
        System.out.println("введённые  игроком " + player.getName() + " числа: ");
        for (int value : playerAttempt) {
            System.out.print(value + " ");
        }
            System.out.println();
    }
}