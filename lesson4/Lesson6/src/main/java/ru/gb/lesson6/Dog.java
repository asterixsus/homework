package ru.gb.lesson6;

import java.util.Random;

public class Dog extends Animal{
    public static int DOG_ID = 0;
    public int min = 400;
    public int max = 600;
    public int diff = max - min;
    public int i;
    public int DogId;

    public Dog(String name) {
        super(name);
        Random random = new Random();
        this.i = random.nextInt(diff + 1);
        i += min;
        this.limitWeightRun = i;
        this.limitWeightSwim = 10;
        this.limitHeight = 0.4;
        this.DogId = DOG_ID;
        DOG_ID++;
    }
}