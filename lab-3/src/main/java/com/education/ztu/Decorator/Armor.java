package com.education.ztu.Decorator;

public class Armor extends HeroDecorator {
    public Armor(Hero hero) {
        super(hero);
    }

    @Override
    public String getDescription() {
        return decoratedHero.getDescription() + " with Armor";
    }

    @Override
    public int getDefense() {
        return decoratedHero.getDefense() + 7;
    }
}