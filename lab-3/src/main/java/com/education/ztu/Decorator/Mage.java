package com.education.ztu.Decorator;

public class Mage implements Hero {
    @Override
    public String getDescription() {
        return "Mage";
    }

    @Override
    public int getAttack() {
        return 12;
    }

    @Override
    public int getDefense() {
        return 2;
    }
}