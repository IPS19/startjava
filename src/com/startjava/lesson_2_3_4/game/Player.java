package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    static boolean isGuess = false;
    private String name;
    private int[] number = new int[10];
    int [] playerAttempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int index) {
        return number[index];
    }

    public int[] getNumber() {
        return number;
    }

    public int getNumberIndex (){
        return this.number.length;
    }

    public void setNumber(int index, int number) {
        this.number[index] = number;
    }

    public void playerAttempt() { //массив с введеными числами
    int count = 0;
    for (int i=0; i<10;i++){
        if (this.getNumber(i) !=0){
            count++;
            }
        }
    playerAttempt = Arrays.copyOfRange(this.getNumber(), 0, count);
        for (int value : playerAttempt)
            System.out.println(value + " ");
    }
}