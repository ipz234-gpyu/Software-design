package com.education.ztu.Decorator;

public class Warrior implements Hero {
    @Override
    public String getDescription() {
        return "Warrior";
    }

    @Override
    public int getAttack() {
        return 10;
    }

    @Override
    public int getDefense() {
        return 5;
    }
}