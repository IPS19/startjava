package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    int countAttempts = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountAttempts(int countAttempts) {
        this.countAttempts = countAttempts;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public void addNumber(int index, int number) {
        numbers[index] = number;
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, countAttempts, 0);
    }
}