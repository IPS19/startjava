package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String name;
    private int yearOfLaunch;
    private String generation;
    private int strength;
    private int armor;

    public Jaeger(String name, int yearOfLaunch, String generation, int strength, int armor) {
        this.name = name;
        this.yearOfLaunch = yearOfLaunch;
        this.generation = generation;
        this.strength = strength;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getYearOfLaunch() {
        return yearOfLaunch;
    }

    public void setYearOfLaunch(int yearOfLaunch) {
        this.yearOfLaunch = yearOfLaunch;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void modify() {
        setGeneration(this.generation + "S");
    }

    public void fury(Jaeger a) {
        a.setStrength(a.strength + 3);
        a.setArmor(a.armor - 2);
    }

    public void compareJaeger(Jaeger b) {
        if (this.strength > b.strength) {
            System.out.println("у егеря " + this.name +
                    " сила атаки больше, чем у егеря " + b.name +" на " +
                    (this.strength - b.strength));
        } else if (this.strength < b.strength) {
            System.out.println("у егеря " + b.name +"сила атаки больше, чем у егеря "
                    + this.name + " на " + (b.strength - this.strength));
        }
        System.out.println();
        if (this.armor > b.armor) {
            System.out.println("у егеря " + this.name + " защита лучше, чем у егеря " +
                    b.name + " на " + (this.armor - b.armor));
        } else if (this.armor < b.armor) {
            System.out.println("у егеря " + b.name + " защита лучше, чем у егеря" +
                    this.armor);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Егерь " +'\n'+
                "имя: " + name + '\n' +
                "год выпуска: " + yearOfLaunch + '\n' +
                "модель: " + generation + '\n' +
                "сила атаки: " + strength +
                " защита: " + armor;
    }
}