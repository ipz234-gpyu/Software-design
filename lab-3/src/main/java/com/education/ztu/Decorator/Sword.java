package com.education.ztu.Decorator;

public class Sword extends HeroDecorator {
    public Sword(Hero hero) {
        super(hero);
    }

    @Override
    public String getDescription() {
        return decoratedHero.getDescription() + " with Sword";
    }

    @Override
    public int getAttack() {
        return decoratedHero.getAttack() + 5;
    }
}