package com.education.ztu.Builder;

public class TestBuilder {
    public static void main(String[] args) {
        CharacterDirector director = new CharacterDirector();
        Character hero = director.createNecromancer();
        Character enemy = director.createLich();

        System.out.println(hero);
        System.out.println(enemy);
    }
}
