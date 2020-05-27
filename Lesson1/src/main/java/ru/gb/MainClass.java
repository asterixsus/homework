package ru.gb;

public class MainClass {

    private static float paragraph3(float a, float b, float c, float d){
        return a * (b + (c / d));

    }
    private static boolean paragraph4(int a, int b){
        return a + b >= 10 && a + b <= 20;

    }
    private static void paragraph5(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    private static boolean paragraph6(int a){
        return a <= 0;

    }
    private static void paragraph7(String name){
        System.out.println("Привет, " + name + " !");

    }


    public static void main(String[] args) {
        System.out.println(paragraph3(1,2,4,2));
        System.out.println(paragraph4(2,5));
        paragraph5(5);
        System.out.println(paragraph6(-2));
        paragraph7("Иван");

    }
}
}
