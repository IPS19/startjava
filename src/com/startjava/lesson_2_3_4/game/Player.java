package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    static boolean isGuess = false;
    private String name;
    private int[] numbers = new int[10];
    private int arrayIndex = 0;

    public int getArrayIndex() {
        return arrayIndex;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumbers(int index) {
        return numbers[index];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers,10);
    }

    public void addNumber(int index, int number) {
        this.numbers[index] = number;
    }

    public void setArrayIndex(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }
}