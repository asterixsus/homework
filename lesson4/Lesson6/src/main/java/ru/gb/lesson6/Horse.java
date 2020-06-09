package ru.gb.lesson6;

public class Horse extends Animal{

    public Horse(String name) {
        super(name);
        this.limitWeightRun = 1500;
        this.limitWeightSwim = 100;
        this.limitHeight = 3;
    }
}