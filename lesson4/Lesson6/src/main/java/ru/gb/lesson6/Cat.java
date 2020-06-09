package ru.gb.lesson6;

public class Cat extends Animal {
    public static int CAT_ID = 0;
    public int CatId;

    public Cat(String name){
        super(name);
        this.limitWeightRun = 200;
        this.limitWeightSwim = 0;
        this.limitHeight = 2;
        this.CatId = CAT_ID;
        CAT_ID++;

    }
}
