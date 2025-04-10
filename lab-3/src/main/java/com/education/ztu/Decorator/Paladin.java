package com.education.ztu.Decorator;

public class Paladin implements Hero {
    @Override
    public String getDescription() {
        return "Paladin";
    }

    @Override
    public int getAttack() {
        return 8;
    }

    @Override
    public int getDefense() {
        return 8;
    }
}