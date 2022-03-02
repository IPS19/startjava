package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int countAttempts = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public int getNumber() {
        return numbers[countAttempts - 1];
    }

    public void addNumber(int number) {
        numbers[countAttempts] = number;
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, countAttempts, 0);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountAttempts(int countAttempts) {
        this.countAttempts = countAttempts;
    }
}