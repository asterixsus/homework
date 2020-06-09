package ru.gb.lesson6;


public class MainClass {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Sharik");
        Dog dog2 = new Dog("Polkan");
        Dog dog3 = new Dog("Belka");
        Cat cat1 = new Cat("Murzik");
        Horse horse1 = new Horse("Chaliy");
        Bird bird1 = new Bird("Kesha");


        dog1.Run(500);
        dog2.Run(305);
        dog1.Swim(10);
        dog3.Run(305);
        cat1.Swim(0);
        horse1.Jump(2);
        bird1.Jump(0.01);

        System.out.println("Всего животных: " + Animal.ANIMAL_ID);
        System.out.println("Всего собак: " + Dog.DOG_ID);
        System.out.println("Всего котов: " + Cat.CAT_ID);

    }
}
