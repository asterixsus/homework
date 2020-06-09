package ru.gb.lesson6;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
        this.limitWeightRun = 5;
        this.limitWeightSwim = 0;
        this.limitHeight = 0.1;
    }
}
