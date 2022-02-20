package com.startjava.lesson_1.app;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("");

        int count = 6;
        while (count >= -6) {
            System.out.println(count);
            count -= 2;
        }

        System.out.println("");

        count = 10;
        int sumOdd = 0;
        do {
            if (count %2 == 0) {
                sumOdd += count;
            }
            count++;
        } while (count <= 20);

        System.out.println(sumOdd);
    }
}