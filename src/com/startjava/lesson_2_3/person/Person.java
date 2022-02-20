package com.startjava.lesson_2_3.person;

public class Person {
    String sex = "male";
    String name = "Bobby";
    int height = 185;
    int weight = 85;
    int age = 85;

    public void run() {
        System.out.println(name + " is run");
    }
    
    public void sit() {
        System.out.println(name + " is sit");
    }
    
    public void go() {
        System.out.println(name + " is go");
    }
    
    public void speak() {
        System.out.println(name + " is speak");
    }
    
    public void learnJava() {
        System.out.println(name + " is learn Java");
    }
}