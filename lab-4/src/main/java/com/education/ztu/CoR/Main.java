package com.education.ztu.CoR;

public class Main {
    public static void main(String[] args) {
        SupportHandler level1 = new LevelOneSupport();
        SupportHandler level2 = new LevelTwoSupport();
        SupportHandler level3 = new LevelThreeSupport();
        SupportHandler level4 = new LevelFourSupport();

        level1.setNext(level2);
        level2.setNext(level3);
        level3.setNext(level4);

        boolean resolved = false;
        while (!resolved) {
            System.out.println("\n--- Система підтримки ---");
            resolved = level1.handleRequest();
        }
        System.out.println("Дякуємо за звернення!");
    }
}
