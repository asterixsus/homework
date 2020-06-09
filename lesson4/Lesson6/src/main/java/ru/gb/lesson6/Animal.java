package ru.gb.lesson6;

public class Animal {
    public static int ANIMAL_ID = 0;
    public double height;
    public int weight;
    public double limitHeight;
    public int limitWeightSwim;
    public int limitWeightRun;
    public String name;
    public int id;

    public Animal(String name) {
        this.name = name;
        this.id = ANIMAL_ID;
        ANIMAL_ID++;

    }

    public void Run(int weight) {
        this.weight = weight;
        if(weight <= limitWeightRun) {
            System.out.println(name + " пробежал");
        }
        else {
            System.out.println("Слишком далеко для " + name + "!");
        }
    }

    public void Swim(int weight) {
        this.weight = weight;
        if(limitWeightSwim == 0) {
            System.out.println(name + " не умеет плавать");
            return;
        }
        if(weight <= limitWeightSwim) {
            System.out.println(name + " проплыл");
        }
        else {
            System.out.println("Слишком далеко для" + name + "!");
        }

    }

    public  void Jump(double height) {
        this.height = height;
        if(height <= limitHeight) {
            System.out.println(name + " подпрыгнул");
        }
        else {
            System.out.println("Слишком высоко для " + name + "!");
        }

    }

}
