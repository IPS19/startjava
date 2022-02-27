package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int playerAttemptQuantity = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getPlayerAttemptQuantity() {
        return playerAttemptQuantity;
    }

    public void setPlayerAttemptQuantity(int playerAttemptQuantity) {
        this.playerAttemptQuantity = playerAttemptQuantity;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, playerAttemptQuantity);
    }

    public void addNumber(int index, int number) {
        numbers[index] = number;
    }

    public void resetNumbers() {
        Arrays.fill(numbers,0,playerAttemptQuantity,0);
    }
}